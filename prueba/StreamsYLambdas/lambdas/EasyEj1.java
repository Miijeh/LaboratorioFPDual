package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EasyEj1 {

	public static void main(String[] args) {
		System.out.println(fizzBuzz(6));

	}

	public static String fizzBuzz(Integer i) {
		String result = "";

		if (i % 3 == 0 && i % 5 == 0) {
			result += "FizzBuzz";
		} else if (i % 3 == 0) {
			result += "Fizz";
		} else if (i % 5 == 0) {
			result += "Buzz";
		} else {
			result += i;
		}

		return result;
	}
}
