package ejemplojdbc.edu.fpdual.conector;

import java.io.IOException;
import java.util.Properties;

public class Conector {

	Properties prop = new Properties();
	
	public Conector() {
		try {
			prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
