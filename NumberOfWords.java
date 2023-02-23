import java.util.Scanner;

public class NumberOfWords {
    public static void main(String args[]) {
        System.out.println("Enter a sentence: ");
        Scanner sc=new Scanner(System.in);
        String string=sc.nextLine();
        String[] str=string.split(" ");
        System.out.print(str.length);
    }
}
