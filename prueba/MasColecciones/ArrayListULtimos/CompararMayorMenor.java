package ArrayListULtimos;

import java.util.Comparator;

public class CompararMayorMenor implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((String) o2).compareTo((String) o1);
	}

}
