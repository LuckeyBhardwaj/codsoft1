import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = rand.nextInt(100)+1;

        int tryCount = 0;

      while(true) {
          System.out.println("Enter your guess (1 to 100) :");

          int playerGuess = scanner.nextInt();
          tryCount++;

          if (playerGuess == randomNumber) {
              System.out.println(" Hurray!! You guess correct number !!");
              System.out.println("It took you "+ tryCount + " tries");
              break;
          } else if (randomNumber > playerGuess) {
              System.out.println("No ! The number is higher . Guess Again. ");
          } else {
              System.out.println("No ! The number is lower . Guess Again. ");
          }

      }
    }
}
