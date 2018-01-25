import java.util.Scanner;

public class Factorials {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userNum;
		String reRun;
		
		System.out.println("Welcome to the Factorial Calculator!\nn! = n(n-1)(n-2)(n-3)...");
		
			do {
				System.out.print("Please enter a integer (1-10): ");
				userNum = input.nextInt();
				input.nextLine();
				int answer = 1;
				
				for (int i=2; i<=userNum;i++) {
					answer *= i; // answer = answer*i;
				}
				System.out.println(userNum + "!=" +answer);
				System.out.println("Continue? (y/n)");
				reRun = input.nextLine();
			} while (reRun.equalsIgnoreCase("y"));
			
		System.out.println("Goodbye!");
		
		
	}
}
