import java.util.*;

public class DiceGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String playAgain;

        do {
            int dice = rand.nextInt(6) + 1;
            System.out.println("🎲 You rolled: " + dice);
            System.out.print("Roll again? (yes/no): ");
            playAgain = sc.next().toLowerCase();
        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing!");
        sc.close();
    }
}
