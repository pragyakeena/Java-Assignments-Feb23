import java.util.Scanner;

public class CheckPos {
	public static void main(String args[]) { 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number you want to check for");
	int num = sc.nextInt();
	
	if(num>0) {
		System.out.println("Number is positive");
	}
	else if(num<0) {
		System.out.println("Number is negative");
	}
	else if (num==0) {
		System.out.println("0");
	}
	}
}
