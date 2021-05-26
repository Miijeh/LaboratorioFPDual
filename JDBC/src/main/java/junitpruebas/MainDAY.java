package junitpruebas;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainDAY {

	public static void main(final String[] args) {
		sortDates(Arrays.asList(new DAY[] { DAY.MON, DAY.WED, DAY.TUE, DAY.THU, DAY.SUN, DAY.SAT, DAY.FRI }));
	}

	public static Set<DAY> sortDates(final List<DAY> dayList) {
		final Set<DAY> set = new TreeSet<DAY>();
		set.addAll(dayList);
		for (final DAY day : set) {
			System.out.println(day);
		}
		return set;
	}


}
