import java.util.Scanner;

public class AmadorAdventureDriver {
	public static void main(String[] args) {
		start();
	}

	private static void start() {
		// TODO Auto-generated method stub
		int numItems = 0;
		int option;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Items collected: " + numItems + "\n" + "You are in the library. Choose a direction to go: east or west?" + "\n" + "Press either 1) Go east" + "\n" + "Or 2) Go west");
		option = s.nextInt();
		if (option == 1) {
			System.out.println("Items collected: " + numItems + "\n" + "You have reached Mr. Hanson's classroom. Choose an item to steal from him." + "\n" + "Press either 1) Steal laptop" + "\n" + "Or 2) Steal bicycle");
			option = s.nextInt();
			if (option == 1) {
				System.out.println("Items collected: " + numItems + "\n" + "You take Mr. Hanson's laptop, but it is actually a bomb. GAME OVER");
			}
			else if (option == 2) {
				numItems++;
				System.out.println("Items collected: " + numItems + "\n" + "You take Mr. Hanson's bicycle.");
			}
		}
		else if (option == 2) {
			System.out.println("Items collected: " + numItems + "\n" + "You have reached Mr. Little's classroom. Choose an action." + "\n" + "Press either 1) Ask him how his day is going" + "\n" + "Or 2) Steal his tie");
			option = s.nextInt();
			if (option == 1) {
				System.out.println("Items collected: " + numItems + "\n" + "You ask Mr. Little how his day is going. Mr. Little is having a bad day. He eats you to soothe his growling stomach. GAME OVER");
			}
			else if (option == 2) {
				numItems++;
				System.out.println("Items collected: " + numItems + "\n" + "You take Mr. Little's tie.");
			}
		}
	}
}