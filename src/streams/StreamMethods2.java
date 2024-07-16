package streams;

import java.util.ArrayList;
import java.util.List;

/*
 * 2. PROCESSING BY count() method.
 * 		This method returns the no. of elements present in the stream
 */

public class StreamMethods2 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Pavan");
		names.add("RaviTeja");
		names.add("Chiranjeevi");
		names.add("Venkatesh");
		names.add("Nagarjuna");
		
		System.out.println("names: " + names);
		
		Long length = names.stream()						// open stream
						.filter(s -> s.length() >= 9)		// configure by filter
						.count();							// process by count
		System.out.println("Length of names which has equal to or more than 9 chars: " + length);
		
		Long upperNames = names.stream()
				.map(s -> s.toUpperCase())
				.count();
		System.out.println("Upper case names length: " + upperNames);
	}
}

/*
 * Output: 
 * 		names: [Pavan, RaviTeja, Chiranjeevi, Venkatesh, Nagarjuna]
		Length of names which has equal to or more than 9 chars: 3
		Upper case names length: 5

 */
