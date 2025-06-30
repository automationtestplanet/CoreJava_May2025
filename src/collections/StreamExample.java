package collections;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		Stream<Integer> stream1 = Stream.of(11, 12, 13, 14, 15);
//		stream1.filter(eachVal -> eachVal%2!=0).forEach(System.out::println);  // Filter		
//		stream1.map(eachVal -> eachVal*5).forEach(System.out::println);  // Map
		int sum = stream1.reduce(0,(val1,val2) -> val1+val2);
		System.out.println(sum);
	}

}
