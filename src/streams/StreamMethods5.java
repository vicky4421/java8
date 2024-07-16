package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * 5. PROCESSING BY forEach() method
 * 		: This method won't return anything.
 * 		: This method can take lambda expression as argument and apply that lambda expression for each element
 * 		  present in the steam.
 */

public class StreamMethods5 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Vivek");
		names.add("Smita");
		names.add("Janhavi");
		
		names.forEach(System.out::println);
	}
}

/*
 * Output: 
 * 		Vivek
		Smita
		Janhavi
 */
