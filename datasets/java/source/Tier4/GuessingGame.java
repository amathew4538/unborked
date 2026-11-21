import java.util.*;

public class GuessingGame {
    public static void main(String[] a) {
        Scanner in = new Scanner(System.in);
        int target = 42;
        System.out.println("Guess a number from 1 to 100");
        for (int i = 1; i <= 8; i++) {
            int g = in.hasNextInt() ? in.nextInt() : 50;
            if (g == target) {
                System.out.println("Correct in " + i + " attempts");
                return;
            }
            System.out.println(g < target ? "Too low" : "Too high");
        }
        System.out.println("Out of guesses");
    }
}
