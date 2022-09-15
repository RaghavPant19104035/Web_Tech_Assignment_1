import java.util.Scanner;

public class Question_3 {
	
	public static void findQuiotientAndRemainder(int num1, int num2) {
        int quotient, remainder;
		
		quotient = num1 / num2;
		remainder = num1 % num2;
		
		System.out.println("Quotient is : " + quotient);
		System.out.println("Remainder is : " + remainder);
	}
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = scn.nextInt();
		
		findQuiotientAndRemainder(num1, num2);
	}

}
