package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * 3. PROCESSING BY sorted() method
 * 		: we can use sorted() to sort elements in stream.
 * 		: we can sort either based on default natural sorting order or
 * 		  based on our own customized sorting order specified by the Comparator object.
 * 
 * 		sorted() : for default natural sorting order.
 * 		sorted(Comparator c) : for customized sorting.
 */

public class StreamMethods3 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		System.out.println("Numbers: " + numbers);
		
		// default natural sorting order
		List<Integer> sortedNumbers = numbers.stream()			// open stream
				.sorted()										// configure by sorting
				.collect(Collectors.toList());					// process by collect
		System.out.println("Sorted list: " + sortedNumbers);
		
		List<Integer> reversedSortedNumbers = numbers.stream()
				.sorted(
					(n1, n2) -> n2.compareTo(n1)				// comparator
				)
				.collect(Collectors.toList());
		System.out.println("Reversed sorted numbers: " + reversedSortedNumbers);
				
	}
}

/*
 * Output: 
 * 		Numbers: [0, 10, 20, 5, 15, 25]
		Sorted list: [0, 5, 10, 15, 20, 25]
		Reversed sorted numbers: [25, 20, 15, 10, 5, 0]
*/
