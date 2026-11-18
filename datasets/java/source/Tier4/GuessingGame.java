package datasets.java.source.Tier4;

public class GuessingGame {
    public static void main(String[] args) {
        int target = 5;
        int[] guesses = {7, 3, 5};
        for (int turn = 0; turn < guesses.length; turn++) {
            System.out.println("guess " + (turn + 1) + ": " + guesses[turn]);
            if (guesses[turn] == target) {
                System.out.println("found: " + target);
                break;
            }
        }
    }
}
