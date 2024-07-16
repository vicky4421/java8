package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * 4. PROCESSING BY min() and max() methods
 * 		min(Comparator c):
 * 			: returns minimum value according to specified comparator.
 * 		max(Comparator c):
 * 			: returns maximum value according to specified comparator.
 */

public class StreamMethods4 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		System.out.println("Numbers: " + numbers);
		
		Optional<Integer> minValue = numbers.stream()
				.sorted()
				.min(
						(n1, n2) -> n1.compareTo(n2)			// default natural sorting order
				);
		System.out.println("min value: " + minValue.get());
		
		Optional<Integer> maxValue = numbers.stream()
				.sorted()
				.max(
						(n1, n2) -> n1.compareTo(n2)			// default natural sorting order
				);
		System.out.println("max value: " + maxValue.get());
	}
}

/*
 * Output: 
 * 		Numbers: [0, 10, 20, 5, 15, 25]
		min value: 0
		max value: 25
*/
