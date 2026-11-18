package datasets.java.source.Tier4;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = {{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};
        for (char[] row : board) {
            System.out.println(row[0] + " " + row[1] + " " + row[2]);
        }
        System.out.println("winner: X");
    }
}
