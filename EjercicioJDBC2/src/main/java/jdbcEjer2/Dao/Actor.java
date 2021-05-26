package jdbcEjer2.Dao;

import java.util.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Actor {

	private int id;
	private String firstName;
	private String lastName;
	private Date lastUpdate;

	public Actor(ResultSet result) {
		super();
		try {
			this.id = result.getInt("actor_id");
			this.firstName = result.getString("first_name");
			this.lastName = result.getString("last_name");
			this.lastUpdate = result.getDate("last_update");
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
	public Actor(String firstName, String lastName, Date lastUpdate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	public Actor(int id,String firstName, String lastName, Date lastUpdate) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.lastUpdate = lastUpdate;
	}
	public Actor(int id) {
		this.id=id;
	}
}
