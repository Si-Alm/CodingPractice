import java.util.Scanner;

public class SayHello {
	public static void sayHello(String name) {
		//print passed name
		System.out.println("Hello, " + name + "!");
	}

	
	public static void main(String[] args) {
		//scanner to read user input
		Scanner in = new Scanner(System.in);

		//prompt user for their name and read their input
		System.out.println("Enter your name: ");
		String name = in.nextLine();

		//call sayHello with user's input
		sayHello(name);
	}
}
