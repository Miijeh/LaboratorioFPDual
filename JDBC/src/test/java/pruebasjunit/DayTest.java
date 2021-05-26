package pruebasjunit;

import static org.junit.Assume.assumeNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import junitpruebas.DAY;
import junitpruebas.MainDAY;

@RunWith(JUnitPlatform.class)
@TestMethodOrder(OrderAnnotation.class)
public class DayTest {
	private List<DAY> days;

	@BeforeEach
	public void indicar() {
		days = (Arrays.asList(new DAY[] { DAY.MON, DAY.TUE, DAY.SAT, DAY.THU, DAY.FRI, DAY.WED, DAY.SUN }));

	}

	@Test
	@Order(1)
	public void sortDates_DatosDesordenados_ok() {
		final List<DAY> days = (Arrays
				.asList(new DAY[] { DAY.MON, DAY.TUE, DAY.WED, DAY.THU, DAY.FRI, DAY.SAT, DAY.SUN }));
		Set<DAY> resultDays = MainDAY.sortDates(days);

	}

	@Test
	@Order(2)
	public void sortDates_DatosOrdenados_ok() {
		assumeNotNull(days);
		Set<DAY> resultDays = MainDAY.sortDates(days);

	}
	@Test
	@Order(3)
	public void sortDates_OrdenarDatos_ok() {
		final List<DAY> days = (Arrays
				.asList(new DAY[] { this.days.get(2),this.days.get(4),this.days.get(6)}));
		Set<DAY> resultDays = MainDAY.sortDates(days);
	}
	@AfterEach
	public void separador() {
		System.out.println("======================================");
	}

}
