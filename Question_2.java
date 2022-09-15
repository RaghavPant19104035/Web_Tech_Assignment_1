
import java.util.Scanner;

public class Question_2 {
	
	public static void multiplyTwoFloatingPoints(double num1, double num2) {
		double multiplication = num1 * num2;
		
		System.out.println("Multiplication of two floating points : " + multiplication);
	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter floating point 1 ");
		double num1 = scn.nextDouble();
		
		System.out.println("Enter floating point 2 ");
		double num2 = scn.nextDouble();
		
		multiplyTwoFloatingPoints(num1, num2);
	}
}
