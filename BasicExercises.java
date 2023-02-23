package com.ericsson.oops;

import java.util.Scanner;

public class BasicExercises {
	public int calculateSum(int n) {
		//Method to calculate sum of first n numbers divisible by 3 or 5
		int sum=0;
		for(int i=0;i<=n;++i) {
			if(i%3==0||i%5==0) {
			sum+=i;
			}
		}
		System.out.println("The sum is "+sum);
		return sum;
	}
	
	public int calculateDifference(int x) {
		//Method to calculate difference between square of sum and sum of squares of n natural numbers
		int difference=0, squaresum=0, sum=0;
		for(int i=0;i<=x;i++) {
			sum+=i;
			squaresum+=i*i;
		}
		int sumsquare=sum*sum;
		difference =sumsquare - squaresum; 
		System.out.println("The difference is:"+difference);
		return difference;
	}
	
	public boolean checkNumber(int num) {
		boolean flag =false;
		int current=num%10;
		num=num/10;
		while(num>0) {
			if (num>=current) {
				flag=true;
				break;
			}
			current=num%10;
			num=num/10;
		}
		if(flag==true) {
			System.out.println("This is an increasing number");
		}
		else {
			System.out.println("This is not an increasing number");
		}
		return flag;
		
	}
	
	public static void main(String args[]) {
		
		BasicExercises obj =new BasicExercises();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter n");
		int x=sc.nextInt();
		obj.calculateSum(x);
		System.out.println("Enter n");
		int a=sc.nextInt();
		obj.calculateDifference(a);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		obj.checkNumber(num);
		
	}

}
