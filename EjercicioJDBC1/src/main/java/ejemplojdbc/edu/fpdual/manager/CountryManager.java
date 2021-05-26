package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;

/**
 * Country DTO Manager.
 * 
 * Contains all the queries used to consult and manipulate Countries data.
 * 
 * @author jose.m.prieto.villar
 *
 */
public class CountryManager {

	/**
	 * Finds all the cities in the DB based on a list of ids.
	 * 
	 * @param con DB connection
	 * @param ids Countries id set to search for.
	 * @return a {@link List} of {@link Country}
	 */
	public List<Country> findAllById(Connection con, Set<String> ids) {
		// Creates the SQL command
		String sql = String.format("SELECT * FROM Country WHERE Code in (%s)",
				ids.stream().map(data -> "\"" + data + "\"").collect(Collectors.joining(", ")));

		// Create a prepared statement
		try (Statement stmt = con.createStatement()) {

			// Executes sql command
			ResultSet result = stmt.executeQuery(sql);
			// Set before first registry before going through it.
			result.beforeFirst();

			// Initializes variables
			List<Country> countries = new ArrayList<>();

			// Run through each result
			while (result.next()) {
				// Initializes a country per result
				countries.add(new Country(result));
			}

			return countries;

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}

	public List<Country> findAllCountriesByName(Connection con, String name) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM COUNTRY WHERE upper(name) like ?")) {
			prepStat.setString(1,"%" + name.toUpperCase() +"%");
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<Country> countriesByName = new ArrayList<Country>();
			while (result.next()) {
				countriesByName.add(new Country(result));
			}
			return countriesByName;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	public List<Country> findAllCountriesStartingWith(Connection con, String name) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM COUNTRY WHERE upper(name) like ?")) {
			prepStat.setString(1,name.toUpperCase() +"%");
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<Country> countriesStartingWith = new ArrayList<Country>();
			while (result.next()) {
				countriesStartingWith.add(new Country(result));
			}
			return countriesStartingWith;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	public List<Country> findAllCountriesEndingWith(Connection con, String name) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM COUNTRY WHERE upper(name) like ?")) {
			prepStat.setString(1, "%"+name.toUpperCase());
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<Country> countriesEndingWith = new ArrayList<Country>();
			while (result.next()) {
				countriesEndingWith.add(new Country(result));
			}
			return countriesEndingWith;
		} catch (SQLException e) {

			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	
	public int updateCountry(Connection con, String idCountry,String newName) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"UPDATE COUNTRY SET NAME = ? WHERE code like ?")){
			prepStat.setString(1, newName);
			prepStat.setString(2, idCountry);
			return prepStat.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
		}
	}
	public int insertCountry(Connection con, Country country) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"INSERT INTO COUNTRY (code) VALUES (?)")){
			prepStat.setString(1, country.getCode());
			return prepStat.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
		}
	}
	public int deleteCountry(Connection con, Country country) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"DELETE FROM COUNTRY WHERE code = ?")){
			prepStat.setString(1, country.getCode());
			return prepStat.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			return 0;
		}
	}
}
