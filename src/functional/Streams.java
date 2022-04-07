package functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Streams {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// get even numbers
		List<Integer> even = numbers.stream().filter(item -> item % 2 == 0).toList();
		System.out.println(even);

		// square every number
		List<Integer> squares = numbers.stream().map(number -> number * number).toList();
		System.out.println(squares);

		// get the sum
		Integer sum = numbers.stream().reduce(0, Integer::sum);
		System.out.println(sum);
		
		System.err.println("= = = = = = = = = =");
		
		// create person record
		record Person(int age, int weight, int height) {}
		List<Person> people = new ArrayList<>();
		Random r = new Random();
		for (int i = 0; i < 10; i++)
			people.add( new Person(r.nextInt(61)+10, r.nextInt(50)+50, r.nextInt(55)+150) );
		people.forEach(System.out::println);
		
		// people taller than 185cm
		List<Person> tallPeople = people.stream().filter(p -> p.height > 185).toList();
		System.out.println(" Tall people:\n"+tallPeople);
		
		// people heavier than 85kg
		List<Person> heavyPeople = people.stream().filter(p -> p.weight > 85).toList();
		System.out.println(" Heavy people:\n"+heavyPeople);
	}
}
