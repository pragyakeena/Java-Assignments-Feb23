import java.util.Scanner;

public class FindSumAndAvg {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first numnber");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		System.out.println("Enter the third number");
		int num3=sc.nextInt();
		System.out.println("Enter the third number");
		int num4 =sc.nextInt();
		System.out.println("Enter the fifth number");
		int num5=sc.nextInt();
		
		int sum = num1+num2+num3+num4+num5;
		int avg = sum/2;
		System.out.println("The sum is " + sum +" and The average is "+ avg);
	}

}
