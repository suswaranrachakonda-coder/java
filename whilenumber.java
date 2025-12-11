import java.util.Random;
import java.util.Scanner;
public class whilenumber {
    public static void main(String[] args) {
        Random rc = new Random();
        Scanner sc = new Scanner(System.in);
        int target = rc.nextInt(10); // Generates a random number between 0 and 99
        int guess=0;
        int attempts=0;
        System.out.println("Number guessing game");
        System.out.println();
        while(guess!=target){
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            if(guess ==target){
                System.out.println("you got the correct answer!");
               attempts++;
                break;
            }
            else if(guess<target){
                System.out.println("Guessed number is less than the target");
                attempts++;
            }
            else{
                System.out.println("Guessed number is more than the traget");
                System.out.println("Number of attempts: "+(++attempts));
            }
        }
    }
}