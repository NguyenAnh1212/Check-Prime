import javax.swing.*;
import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(num < 2){
            System.out.println(num + " is not a prime.");
        }
        else {
//            int i = 2;
            boolean check = true;
            for (int i = 2; i < Math.sqrt(num) ; i++) {
                if(num%i == 0){
                    check = false;
                }

            }
            if(check){
                System.out.println(num + " is a prime.");
            }else {
                System.out.println(num + " is not a prime.");
            }
        }
    }
}
