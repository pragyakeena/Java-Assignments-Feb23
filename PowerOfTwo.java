import java.util.Scanner;

public class PowerOfTwo {

    public boolean checkNumber(int num) {
        boolean b = true;
        while (num != 1) {
            if (num % 2 != 0) {
                b = !b;
                System.out.print(b);
                System.exit(0);
            }
            num = num / 2;
        }
        if(b==true){
            System.out.print("The number is a power of 2");
        }
        else if(b==false) {
            System.out.println("The number is not a power of 2");
        }
        return true;
    }

    public static void main(String[] args) {
        PowerOfTwo obj = new PowerOfTwo();
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number : ");
        int num = in.nextInt();
        obj.checkNumber(num);
    }

}
