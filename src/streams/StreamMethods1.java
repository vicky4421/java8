package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*
 * After creating a stream ( by calling stream() on a collection) and
 * configuring stream ( by filter or map methods)
 * there are various methods to process the stream for our convenience.
 */

/*
 * 1. PROCESSING BY collect() method.
 * 		This method collects the elements from the stream and add it to the specified collection.
 */

public class StreamMethods1 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<String>();
        names.add("Pavan");
        names.add("RaviTeja");
        names.add("Chiranjeevi");
        names.add("Venkatesh");
        names.add("Nagarjuna");

        System.out.println("names: " + names);

        List<String> longNames = names.stream()				// open stream
                .filter(s -> s.length() >= 9)				// configure by filter
                .collect(Collectors.toList());				// collect elements to specified collection (here list)
        System.out.println("Long names: " + longNames);

        List<String> upperNames = names.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Upper case names: " + upperNames);
    }

}

/*
 * Output:
 *		names: [Pavan, RaviTeja, Chiranjeevi, Venkatesh, Nagarjuna]
		Long names: [Chiranjeevi, Venkatesh, Nagarjuna]
		Upper case names: [PAVAN, RAVITEJA, CHIRANJEEVI, VENKATESH, NAGARJUNA]

 */
