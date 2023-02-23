package com.ericsson.oops;

import java.util.Scanner;

public class SmallestNumber {
	public void SmallestNo(int num1, int num2,int num3) {
		if(num1<num2 && num1<num3) {
			System.out.println("Smallest number is:" +num1);
		}
		if(num2<num1 && num2<num3) {
			System.out.println("Smallest number is:" +num2);
		}
		if(num3<num1 && num3<num2) {
			System.out.println("Smallest number is:" +num3);
		}
	}
	public static void main(String args[]) { 
		SmallestNumber smallestnumber =new SmallestNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		smallestnumber.SmallestNo(num1, num2, num3);
	}

}
