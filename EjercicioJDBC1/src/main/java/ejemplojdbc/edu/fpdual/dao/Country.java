package ejemplojdbc.edu.fpdual.dao;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter

public class Country {

	String id;
	String code;
	String name;
	String continent;
	String region;
	BigDecimal surfaceArea;
	int independenceYear;
	BigInteger population;
	Double lifeExpectancy;
	Double gnp;
	Double gnpoId;
	String localName;
	String govermentForm;
	String headOfState;
	int capitalCode;

	public Country(ResultSet result) {
		try {
			this.id = result.getString("Code");
			this.code = result.getString("Code2");
			this.name = result.getString("Name");
			this.continent = result.getString("Continent");
			this.region = result.getString("Region");
			this.surfaceArea = result.getBigDecimal("SurfaceArea");
			this.independenceYear = result.getInt("IndepYear");
			this.population = result.getBigDecimal("population").toBigInteger();
			this.lifeExpectancy = result.getDouble("LifeExpectancy");
			this.gnp = result.getDouble("GNP");
			this.gnpoId = result.getDouble("GNPOld");
			this.localName = result.getString("LocalName");
			this.govermentForm = result.getString("GovernmentForm");
			this.headOfState = result.getString("HeadOfState");
			this.capitalCode = result.getInt("Capital");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Country(String code) {
		super();
		this.code = code;
		
	}
	public Country(String code,String name) {
		super();
		this.code = code;
		this.name = name;
	}
	@Override
	public String toString() {
		if(this.equals(null)) {
		return "Country [id=" + id + ", code=" + code + ", name=" + name + ", continent=" + continent + ", region="
				+ region + ", surfaceArea=" + surfaceArea + ", independenceYear=" + independenceYear + ", population="
				+ population + ", lifeExpectancy=" + lifeExpectancy + ", gnp=" + gnp + ", gnpoId=" + gnpoId
				+ ", localName=" + localName + ", govermentForm=" + govermentForm + ", headOfState=" + headOfState
				+ ", capitalCode=" + capitalCode + "]";
		}else {
			return  code ;
		}
	}
	
	
	
}
