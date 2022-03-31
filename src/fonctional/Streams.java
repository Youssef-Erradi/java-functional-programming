package fonctional;

import java.util.Arrays;
import java.util.List;

public class Streams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		// get even numbers
		List<Integer> even = numbers.stream().filter(item -> item % 2 == 0).toList();
		System.out.println(even);
		
		// square every number
		List<Integer> squares = numbers.stream().map(number -> number*number).toList();
		System.out.println(squares);
		
		// get the sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
	}
}
