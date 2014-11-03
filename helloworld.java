import java.util.Scanner;
class helloworld {

static String s;

public static void main (String []arg) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Hello World");
	System.out.print("What is your name? "); System.out.flush();
	s = scan.nextLine();
	System.out.println("Hello "+ s + "!");

	};
};
