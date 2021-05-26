package ejemplojdbc.edu.fpdual.manager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.mysql.cj.xdevapi.ExprParser;

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
	
	public List<CountryLanguage> findByID(Connection con, String code) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"SELECT * FROM countrylanguage where upper(countrycode) = ?")){
			prepStat.setString(1, code);
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			List<CountryLanguage> countriesByID = new ArrayList<>();
			while(result.next()) {
				countriesByID.add(new CountryLanguage(result));
			}
			return countriesByID;
		} catch (SQLException e) {
			e.printStackTrace();
			return Collections.emptyList();
		}
	}
	
	public String findLanguageByID(Connection con, String id) {
		String languageById = "Languages with ID : " + id + " [";
		try (PreparedStatement prepStat = con.prepareStatement(
				"SELECT * from countrylanguage WHERE CountryCode = ?")){
			prepStat.setString(1, id);
			ResultSet result = prepStat.executeQuery();
			result.beforeFirst();
			
			while (result.next()) {
				languageById += result.getString("language") + ", ";
			}
			
			languageById = languageById.substring(0,languageById.length()-2) + "]";
			return languageById;
		} catch (SQLException e) {
			return "SQLException";
		}
	}
	
	public void updateLanguage(Connection con, String countryCode, String language,String newLanguage,String official, Float percentage) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"UPDATE COUNTRYLANGUAGE SET language = ? ,isOfficial = ?, percentage = ? where countrycode = ? and language = ?")){
			prepStat.setString(1, newLanguage);
			prepStat.setString(2, official);
			prepStat.setFloat(3, percentage);
			prepStat.setString(4, countryCode);
			prepStat.setString(5, language);
			prepStat.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertLanguage(Connection con, String newCountryCode,String newLanguage,String newIsOfficial,Float newPercentage) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"INSERT INTO countrylanguage VALUES (?,?,?,?)")){
			prepStat.setString(1, newCountryCode);
			prepStat.setString(2, newLanguage);
			prepStat.setString(3, newIsOfficial);
			prepStat.setFloat(4, newPercentage);
			prepStat.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQLException");
		}
	}
	
	public void deleteLanguage(Connection con, String delCountryCode, String delLanguage) {
		try (PreparedStatement prepStat = con.prepareStatement(
				"DELETE FROM countrylanguage WHERE countrycode = ? and language = ?")){
			prepStat.setString(1, delCountryCode);
			prepStat.setString(2, delLanguage);
			prepStat.executeUpdate();
		} catch (SQLException e) {
			System.out.println("SQLException");
			e.printStackTrace();
		}
	}
	
	
}
