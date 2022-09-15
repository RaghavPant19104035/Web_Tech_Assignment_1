import java.util.Scanner;


public class Question_4 {
	
	public static void swapTwoVariablesUsingTempVar(int num1, int num2) {
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("swap two variables using temporary variable : " + num1 +", "+num2);
	}
	
	public static void swapTwoVariablesWithoutUsingTempVar(int num1, int num2) {
		
	    num1 ^= num2;  // storing XOR of num1 and num2 in num1
	    num2 ^= num1;  // doing XOR to restore num1
	    num1 ^= num2;  // doing XOR to restore num2
	    
	    System.out.println("swap two variables without using temporary variable : " + num1 +", "+num2);
	}
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number 1 ");
		int num1 = scn.nextInt();
		
		System.out.println("Enter number 2 ");
		int num2 = scn.nextInt();
		
		swapTwoVariablesUsingTempVar(num1, num2);
		
		swapTwoVariablesWithoutUsingTempVar(num1, num2);
	}

}
