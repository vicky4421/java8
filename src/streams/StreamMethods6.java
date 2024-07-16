package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * 6. PROCESSING BY toArray() method.
 * 		We can use toArray() to copy elements present in the stream to specified array.
 */

public class StreamMethods6 {
	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(20);
		numbers.add(5);
		numbers.add(15);
		numbers.add(25);
		System.out.println("Numbers: " + numbers);
		
		Integer[] nums = numbers.stream().toArray(Integer[]::new);
		System.out.println("Integer array: " + nums);
	}
}

/*
 * Output: 
 * 		
 */
