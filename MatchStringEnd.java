import java.util.Scanner;

public class MatchStringEnd {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        String check=sc.next();
        int lengthS=string.length();
        int length=check.length();


        if(string.substring(lengthS-length, lengthS).equals(check))
            System.out.print("Exists");
        else
            System.out.print("Doesn't Exist");

    }
}
