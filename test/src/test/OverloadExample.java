package test;

public class OverloadExample {

	public static void main(String[] args) {

		over(15);
		over("Popescu Ion");
		int response = over("Georgescu George", 20);
		
		if (response == 1) {
			System.out.println("TOTUL E CORECT!");
		}
	}
	
	private static void over (Integer number) {
		System.out.println("Number: " + number);
	}
	
	private static void over (String name) {
		System.out.println("Name: " + name);
	}
	
	private static Integer over (String name, Integer number) {
		System.out.println("Name: " + name + "\nNumber: " + number);
		
		return 1;
	}
}

/*
Number: 15
Name: Popescu Ion
Name: Georgescu George
Number: 20
TOTUL E CORECT!
*/