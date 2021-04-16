package ejemplojdbc.edu.fpdual.main;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Set;
import java.util.TreeSet;

import ejemplojdbc.edu.fpdual.conector.Conector;
import ejemplojdbc.edu.fpdual.dao.City;
import ejemplojdbc.edu.fpdual.dao.Country;
import ejemplojdbc.edu.fpdual.manager.CityManager;
import ejemplojdbc.edu.fpdual.manager.CountryLanguageManager;
import ejemplojdbc.edu.fpdual.manager.CountryManager;

public class Main {

	public static void main(String[] args) {
		// Connects to the DB
		Connection con = new Conector().getMySQLConnection();
		try {
			// Find city by ID
			// new CityManager().findByID(con, 7000).forEach(city ->
			// System.out.println(city));

			// Find city starting with...
			// new CityManager().findAllByNameStartingWith(con,"Sev","Dos").forEach(city
			// ->System.out.println(city));

			// Find city by name
			// new CityManager().findByName(con,
			// "SEVILLA").forEach(city->System.out.println(city));

			// Find city ending with...
			// new CityManager().findByNameEndingWith(con,
			// "nas").forEach(city->System.out.println(city));

			// Update city's name by id and show with findById
			// System.out.println((new CityManager().updateCity(con, 1000, "cambiar") > 0 ?
			// "Update completed" : "Not updated"));
			// new CityManager().findByID(con, 1000).forEach(city ->
			// System.out.println(city));

			// Insert new city and delete.
			// new CityManager().insertCity(con, new City(8000, "Ochomil", "ESP",
			// "Andalucia",new BigDecimal(12353)));
			// new CityManager().findByID(con, 8000).forEach(city ->
			// System.out.println(city));
			// new CityManager().deleteCity(con, new
			// CityManager().findByID(con,8000).get(0));

			// Find all countries by id
			//Set<String> countriesToFind = new TreeSet<String>();
			//countriesToFind.add("Esp");countriesToFind.add("And");
			//new CountryManager().findAllById(con, countriesToFind).forEach(country->System.out.println(country));

			// Find country by name
			//new CountryManager().findAllCountriesByName(con, "SPAI").forEach(country->System.out.println(country));
			
			//Find country by name starting by...
			//new CountryManager().findAllCountriesStartingWith(con, "SPAI").forEach(country->System.out.println(country));

			//Find country by name ending by...
			//new CountryManager().findAllCountriesEndingWith(con, "PAIn").forEach(country->System.out.println(country));

			//Update name of a country
			//String newName = "Paca";
			//new CountryManager().updateCountry(con,"AIA", newName);
			//new CountryManager().findAllCountriesByName(con,newName).forEach(country->System.out.println(country));
			
			//Insert new country
			//Country sevilla = new Country("SEv","Sevilla");
			//new CountryManager().insertCountry(con, sevilla);
			//new CountryManager().deleteCountry(con, sevilla);
			
			//Find all countries languages
			new CountryLanguageManager().findAll(con).forEach(language->System.out.println(language));
			
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
