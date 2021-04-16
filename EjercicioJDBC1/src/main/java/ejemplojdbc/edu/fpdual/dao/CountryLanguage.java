package ejemplojdbc.edu.fpdual.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import ejemplojdbc.edu.fpdual.manager.CountryManager;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CountryLanguage {

	public CountryLanguage(ResultSet result) {
		try {
			this.country = new Country(result.getString("countryCode"));
			this.language=result.getString("language");
			this.isOficial=(result.getString("isOfficial")=="T") ? true : false;
			this.percentage=result.getDouble("percentage");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	Country country;
	String language;
	boolean isOficial;
	Double percentage;
	
}
