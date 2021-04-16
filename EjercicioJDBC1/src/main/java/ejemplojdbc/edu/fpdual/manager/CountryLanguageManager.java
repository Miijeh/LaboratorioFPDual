package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ejemplojdbc.edu.fpdual.dao.CountryLanguage;

public class CountryLanguageManager {

	public List<CountryLanguage> findAll(Connection con) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"SELECT * FROM countrylanguage")){
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<CountryLanguage> countryLanguagesList = new ArrayList<>();
		
			while(result.next()) {
				countryLanguagesList.add(new CountryLanguage(result));
			}
			return countryLanguagesList;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
}
