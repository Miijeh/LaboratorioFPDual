package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;

/**
 * City DTO Manager.
 * 
 * Contains all the queries used to consult and manipulate Cities data.
 * 
 * @author jose.m.prieto.villar
 *
 */
public class CityManager {

	/**
	 * Finds all the cities in the DB
	 * 
	 * @param con DB connection
	 * @return a {@link List} of {@link City}
	 */
	public List<City> findAll(Connection con) {
		// Create general statement
		try (Statement stmt = con.createStatement()) {
			// Queries the DB
			ResultSet result = stmt.executeQuery("SELECT * FROM City");
			// Set before first registry before going through it.
			result.beforeFirst();

			// Initializes variables
			List<City> cities = new ArrayList<>();
			Map<Integer, String> countries = new HashMap();

			// Run through each result
			while (result.next()) {
				// Initializes a city per result
				cities.add(new City(result));
				// Groups the countried by city
				countries.put(result.getInt("ID"), result.getString("CountryCode"));
			}

			// Fills the country of each city
			fillCountries(con, countries, cities);

			return cities;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Fills all the countries for each city.
	 * 
	 * @param con       the Db connection
	 * @param countries the map of cities and countries.
	 * @param cities    the list of cities to update.
	 */
	private void fillCountries(Connection con, Map<Integer, String> countries, List<City> cities) {
		// Obtains all the country codes to search
		Set<String> countryCodes = new HashSet<>(countries.values());

		// Looks for all countries and groups them by id.
		Map<String, Country> countriesMap = new CountryManager().findAllById(con, countryCodes).stream()
				.collect(Collectors.toMap(Country::getId, data -> data));

		// Associates the corresponding Country to each City
		cities.forEach(city -> {
			String countryCode = countries.get(city.getId());
			Country foundCountry = countriesMap.get(countryCode);
			city.setCountry(foundCountry);
		});

	}

	public List<City> findAllByNameStartingWith(Connection con, String prefix, String dos) {

		try (PreparedStatement prepStmt = con.prepareStatement("SELECT * FROM City WHERE name LIKE ? or name like ?")) {

			prepStmt.setString(1, prefix + "%");
			prepStmt.setString(2, dos + "%");

			ResultSet result = prepStmt.executeQuery();
			result.beforeFirst();

			List<City> cities = new ArrayList<>();

			while (result.next()) {
				cities.add(new City(result));
			}

			return cities;
		} catch (SQLException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}

	}

	public List<City> findByID(Connection con, int id) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM city WHERE ID = ?")) {
			prepStat.setInt(1, id);
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<City> ciudadesPorId = new ArrayList<City>();
			while (result.next()) {
				ciudadesPorId.add(new City(result));
			}
			return ciudadesPorId;
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ID not found");
			return Collections.emptyList();
		}
	}

	public List<City> findByName(Connection con, String name) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM city WHERE name = ?")) {
			prepStat.setString(1, name);
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<City> citiesByName = new ArrayList<City>();
			
			while(result.next()) {
				citiesByName.add(new City(result));
			}
			return citiesByName;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}

	}
	
	public List<City> findByNameEndingWith(Connection con, String suffix) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM city WHERE upper(name) like ?")){
			prepStat.setString(1, "%" +suffix);
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<City> citiesEndingWith = new ArrayList<City>();
			while(result.next()) {
				citiesEndingWith.add(new City(result));
			}
			return citiesEndingWith;
		} catch (SQLException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	
	public int updateCity(Connection con, int id,String newName) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"UPDATE city SET name = ? WHERE city.id = ?")){
			
			prepStat.setString(1, newName);
			prepStat.setInt(2, id);
			return prepStat.executeUpdate();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
			
		}
	}
	
	public void insertCity(Connection con,City city) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"INSERT INTO CITY (ID,Name,countrycode,district,population) "
				+ "VALUES(?,?,?,?,?)")){
			prepStat.setInt(1, city.getId());
			prepStat.setString(2, city.getName());
			prepStat.setNString(3, city.getCountry().getCode());
			prepStat.setString(4, city.getDistrict());
			prepStat.setInt(5, city.getPopulation().intValue());
			prepStat.executeUpdate();

		} catch (SQLException e) {
			System.out.println("Duplicated ID, city didnt inserted");
		}
	}
	
	public String deleteCity(Connection con, City city) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"DELETE FROM CITY WHERE ID = ?")){
			prepStat.setInt(1, city.getId());
			prepStat.executeUpdate();
			return "Deleted city";
			
		} catch (SQLException e) {
			
			return "Undeleted city";
		}
	}

}
