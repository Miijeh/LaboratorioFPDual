package jdbcEjer2.Main;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

import jdbcEjer2.Dao.Actor;
import jdbcEjer2.Manager.ActorManager;
import jdbcEjer2.conector.Conector;

public class Main {

	public static void main(String[] args) {
		Connection con = new Conector().getMYSQLConnection();
		Date fechaHoy = new Date();
		
		//Find all actors
		//new ActorManager().findAllActors(con).forEach(actor->System.out.println(actor));
	
		//Find actor by ID
		//new ActorManager().findActorByID(con, 143).forEach(actor->System.out.println(actor));
		
		//Insert new actor
		//Actor act1 = new Actor("Dani","Tutor",fechaHoy);
		//new ActorManager().insertActor(con, act1);
		
		//Delete actor
		//new ActorManager().deleteActor(con,new Actor(202));
		
		//Update actor
		//new ActorManager().updateActor(con,new Actor(201,"Updat","Actualizado",fechaHoy));
	}

}
