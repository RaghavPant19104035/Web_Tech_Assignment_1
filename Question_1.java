import java.util.Scanner;

public class Question_1 {
	
	public static void addTwoNumbers(int num1, int num2) {
		int sum = num1 + num2;
		
		System.out.println("addition of two numbers is : " +sum);
	}
	
	public static void subtarctTwoNumbers(int num1, int num2) {
		int subtraction = num1 - num2;
		
		System.out.println("Subtraction of two numbers : " + subtraction);
	}
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = scn.nextInt();
		
		addTwoNumbers(num1, num2);
		
		subtarctTwoNumbers(num1, num2);
	}
}
