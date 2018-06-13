import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Random;
import java.util.Scanner;

public class Violetta {
    public static void main(String[] args){
        System.out.println("Guess a number");
        Random r=new Random();
        int n=r.nextInt(10);
        Scanner scanner = new Scanner(System.in);
        while(true){
            int someInt = Integer.valueOf(scanner.nextLine());
            if(n==someInt){
                System.out.println("Yes");
                break;
            } else{
                if(n<someInt){
                    System.out.println("Your number is bigger");
                }
                else{
                    System.out.println("Your number is smaller");
                }
                System.out.println("No, try again");
            }

        }
    }
}
