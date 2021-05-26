package jdbcEjer2.Manager;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jdbcEjer2.Dao.Actor;

public class ActorManager {

	public List<Actor> findAllActors(Connection con) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM actor")) {
			ResultSet result = prepStat.executeQuery();
			// result.beforeFirst();
			List<Actor> allActors = new ArrayList<>();
			while (result.next()) {
				allActors.add(new Actor(result));
			}
			return allActors;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public List<Actor> findActorByID(Connection con, int id) {
		try (PreparedStatement prepStat = con.prepareStatement("SELECT * FROM actor where actor_id = ?")) {
			prepStat.setInt(1, id);
			ResultSet result = prepStat.executeQuery();
			// result.beforeFirst();

			List<Actor> allActors = new ArrayList<>();
			while (result.next()) {
				allActors.add(new Actor(result));
			}
			return allActors;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return Collections.emptyList();
	}

	public void insertActor(Connection con, Actor actor) {

		try (PreparedStatement prepStat = con
				.prepareStatement("INSERT INTO ACTOR VALUES ((SELECT MAX(actor_id)+1 from actor act),?,?,?)")) {
			prepStat.setString(1, actor.getFirstName());
			prepStat.setString(2, actor.getLastName());
			prepStat.setDate(3,
					Date.valueOf(LocalDate.ofInstant(actor.getLastUpdate().toInstant(), ZoneId.systemDefault())));
			prepStat.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void deleteActor(Connection con, Actor actor) {

		try (PreparedStatement prepStat = con.prepareStatement("DELETE FROM ACTOR WHERE actor_id = ?")) {
			prepStat.setInt(1, actor.getId());
			prepStat.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}

	public void updateActor(Connection con, Actor actor) {

		try (PreparedStatement prepStat = con
				.prepareStatement("UPDATE actor SET first_name = ?,last_name = ?,last_update = ? WHERE actor_id = ?")) {
			prepStat.setString(1, actor.getFirstName());
			prepStat.setString(2, actor.getLastName());
			prepStat.setDate(3,
					Date.valueOf(LocalDate.ofInstant(actor.getLastUpdate().toInstant(), ZoneId.systemDefault())));
			prepStat.setInt(4, actor.getId());
			prepStat.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
