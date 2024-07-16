package streams;

import java.util.ArrayList;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(0);
		numbers.add(10);
		numbers.add(15);
		numbers.add(20);
		numbers.add(25);
		numbers.add(5);

		List<Integer> evenList = numbers.stream()		// stream creation
				.filter(no -> no % 2 == 0)				// configuration: by filter()
				.collect(Collectors.toList());			// processing: by collect()
		
		List<Integer> doubledList = numbers.stream()
				.map(no -> no * 2)
				.collect(Collectors.toList());
		
		System.out.println(numbers);
		System.out.println(evenList);
		System.out.println(doubledList);
	}

}
