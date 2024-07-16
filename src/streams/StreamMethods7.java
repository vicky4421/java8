package streams;

import java.util.stream.Stream;

/*
 * 7. Stream.of() method:
 * 		we can apply stream for group of values and arrays
 */

public class StreamMethods7 {
	public static void main(String[] args) {
		// for group of values
		Stream<Integer> values = Stream.of(2, 22, 222, 2222, 22222);
		values.forEach(System.out::println);
		
		// for arrays
		Double[] doubles = {10.0, 10.1, 10.2, 10.3};
		Stream<Double> doubleStream = Stream.of(doubles);
		doubleStream.forEach(System.out::println);
	}
}

/*
 * Output: 
 * 		2
		22
		222
		2222
		22222
		
		10.0
		10.1
		10.2
		10.3
 */
