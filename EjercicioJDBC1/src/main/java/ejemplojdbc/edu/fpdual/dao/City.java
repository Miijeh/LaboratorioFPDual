package ejemplojdbc.edu.fpdual.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class City {

	int id;
	String name;
	Country country;
	String district;
	BigDecimal population;

	public City(ResultSet result) {
		try {
			this.id = result.getInt("ID");
			this.name = result.getString("name");
			this.district = result.getString("District");
			this.population = result.getBigDecimal("Population");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public City(int id, String name, String countryCode, String district, BigDecimal population) {
		
		this.id = id;
		this.name = name;
		this.country = new Country(countryCode);
		this.district = district;
		this.population = population;
	}
	
	
	
}
