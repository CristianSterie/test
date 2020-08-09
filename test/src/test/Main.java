package test;

import java.util.Arrays;
import java.util.List;

public class Main {
	private static final String DOUBLE_TEXT = "double";
	private static final int STRING_INTEGER = 5;

	private static Integer integerSum = 0;
	
	public static void main(String... args) {
		List<Integer> integerList = Arrays.asList(1,2,3,7,5,6,4,8,9,10,11); //55
		List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0); // 10
		List<String> stringList1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7"); //28
		List<String> stringList2 = Arrays.asList("1", "Ana are mere", "3", "4", "5", "6", "7"); //error
		
//		System.out.println(stringList.get(1));
	
//		System.out.println(sum(integerList));
//		System.out.println(sum(doubleList, DOUBLE_TEXT));
//		System.out.println(sum(stringList1, STRING_INTEGER));
		System.out.println(sum(stringList2, STRING_INTEGER));

		
	}
	
	/*  1. Classic For  */
	private static Integer sum (List<Integer> list) {
//		int n = 10; // forced to 10 elements
		int n = list.size();
//		Integer integerSum;
		int integerSum = 0;
		int sum3 = 0;
		
		for (int i = 0; i < n; i++) {
			integerSum += list.get(i);
			
			if (i%3 == 1) {
				sum3 += list.get(i);
				System.out.print(list.get(i) + " ");
			}
		}
		
		System.out.println("Suma el. carora la impartirea cu 3 au restul 1: " + sum3);
		System.out.println("Integer sum: " + integerSum);
		
		return integerSum;
	}
	
	/*  2. Newer For  */
	private static Double sum (List<Double> list, String text) {
		double doubleSum = 0.0;
		
		for (Double item : list) {
			doubleSum += item;
		}
	
		System.out.println("Suma " + text + " : " + doubleSum);
		
		return doubleSum;
	}
	
	/*  3. ForEach For */
	private static String sum (List<String> list, Integer number) {
		String stringSum;
		
		//String item 
		list.forEach(item -> {
			try {
				integerSum += Integer.valueOf(item);
			} catch (NumberFormatException ex) {
				// do nothing or just skip
			}
		});
		
		stringSum = integerSum.toString();
		
		
		return stringSum;
//		return integerSum.toString();
	}
}
