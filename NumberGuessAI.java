import java.util.Random;
import java.util.Scanner;

public class NumberGuessAI {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int secret = random.nextInt(100) + 1;

        while(true) {
            System.out.print("Guess Number: ");
            int guess = sc.nextInt();

            if(guess == secret) {
                System.out.println("Correct!");
                break;
            } else if(guess < secret) {
                System.out.println("Too Low");
            } else {
                System.out.println("Too High");
            }
        }
        sc.close();
    }
}