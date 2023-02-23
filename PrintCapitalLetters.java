import java.util.Scanner;

public class PrintCapitalLetters {
    public static void main(String[] args) {
        System.out.println("Enter a sentence: ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                System.out.println(str.charAt(i));
            }
        }
    }
}
