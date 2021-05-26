package junitpruebas;

import lombok.Getter;

@Getter
public enum DAY {
	MON("MONDAY", 1), TUE("TUESDAY", 2), WED("WEDNESDAY", 3), THU("THURSDAY", 4), FRI("FRIDAY", 5), SAT("SATURDAY", 6),
	SUN("SUNDAY", 7);

	private String name;
	private int index;

	DAY(String name, int index) {
		this.name = name;
		this.index = index;
	}
}
