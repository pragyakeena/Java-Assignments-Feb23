import java.util.Scanner;

public class EmployeeInfo {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter the Employee ID");
	String empid =sc.next();
	System.out.println("Enter the Employee's Name");
	String name =sc.next();
	System.out.println("Enter the Employee's Salary");
	int salary = sc.nextInt();
	System.out.println("Enter the Employee's Address");
	String address=sc.next();
	System.out.println("Enter the Employee's contact number");
	int contactnum = sc.nextInt();
	System.out.println("Enter the Employee's Gender");
	char gender = sc.next().charAt(0);
	
	System.out.println(" Employee ID : "+empid + "Employee's Name : "+name+"Employee's Salary : "+salary+"Employee's Address : "+address+"Employee's contact number : "+contactnum+ "Employee's Gender : " +gender);
}
}
