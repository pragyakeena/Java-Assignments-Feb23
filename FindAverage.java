import java.util.Scanner;

public class FindAverage {
    public void Average(int a, int b, int c){
       int avg= (a+b+c)/3;
       System.out.println("The average of the given numbers is "+avg);
    }
    public static void main(String args[]){
        FindAverage avg =new FindAverage();
        System.out.println("Enter the three numbers you want average of: ");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        avg.Average(a,b,c);
    }
}
