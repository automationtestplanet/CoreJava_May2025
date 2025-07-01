package functionalinterfaces;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredefinedFunctionalInterafces {
	
	public static void printNumber(int number) {
		System.out.println(number);
	}

	public static void main(String[] args) {

		System.out.println("-------------------------Function---------------------");

		Function<Integer, String> function1 = new Function<>() {
			@Override
			public String apply(Integer val1) {
				return "Java";
			}
		};

		System.out.println(function1.apply(100));

		Function<Integer, String> function2 = (val1) -> "Java";
		System.out.println(function2.apply(1000));

		System.out.println("-------------------------Predicate---------------------");

		Predicate<Integer> predicate1 = new Predicate<Integer>() {
			@Override
			public boolean test(Integer val1) {
				return val1 > 100;
			}
		};

		System.out.println(predicate1.test(100));

		Predicate<Integer> predicate2 = (val1) -> val1 > 100;
		System.out.println(predicate2.test(101));

		System.out.println("-------------------------Consumer---------------------");
		Consumer<Integer> consumer1 = new Consumer<Integer>() {
			@Override
			public void accept(Integer val1) {
				System.out.println(val1);
			}
		};

		consumer1.accept(1000);

		Consumer<String> consumer2 = (val1) -> System.out.println(val1);
		consumer2.accept("Java");
		
		Consumer<Integer> consumer3 = PredefinedFunctionalInterafces::printNumber;
		consumer3.accept(100000);

		System.out.println("-------------------------Supplier---------------------");

		Supplier<Integer> supplier1 = new Supplier<Integer>() {
			@Override
			public Integer get() {
				return 10000;
			}
		};

		System.out.println(supplier1.get());

		Supplier<String> supplier2 = () -> "Hello";
		System.out.println(supplier2.get());

		System.out.println("-------------------------BiFunction---------------------");
		BiFunction<Integer, Integer, Boolean> biFunction = new BiFunction<>() {
			@Override
			public Boolean apply(Integer val1, Integer val2) {
				return val1 == val2;
			}
		};
		System.out.println(biFunction.apply(100, 99));

		BiFunction<Integer, Integer, Integer> biFunction2 = (val1, val2) -> val1 + val2;
		System.out.println(biFunction2.apply(100, 99));
		
		System.out.println("-------------------------BinaryOperator---------------------");
		BinaryOperator<Integer> binaryOperaotor1 = new BinaryOperator<Integer>() {			
			@Override
			public Integer apply(Integer val1, Integer val2) {
				return val1+val2;
			}
		};
		System.out.println(binaryOperaotor1.apply(100, 200));
		
		BinaryOperator<Integer> binaryOperaotor2 = (val1,val2)-> val1+val2;
		System.out.println(binaryOperaotor2.apply(100, 200));
		
		System.out.println("---------------------------Comparator--------------------");
		Comparator<Integer> comparator1 = new Comparator<Integer>() {			
			@Override
			public int compare(Integer o1, Integer o2){
				if(o1 > o2) return 0 ;
				else return -1;
			}
		};
		
		Comparator<Integer> comparator2 = (obj1,obj2) -> {if(obj1 > obj2) return 0;else return -1;};

	}

}
