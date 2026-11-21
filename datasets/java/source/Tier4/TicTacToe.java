public class TicTacToe {
    public static void main(String[] a) {
        char[] b = new char[9];
        java.util.Arrays.fill(b, ' ');
        for (int t = 0; t < 9; t++) {
            char p = t % 2 == 0 ? 'X' : 'O';
            int m = p == 'X' ? 4
                    : java.util.stream.IntStream.range(0, 9).filter(i -> b[i] == ' ').findFirst().orElse(8);
            if (b[m] != ' ')
                continue;
            b[m] = p;
            for (int r = 0; r < 3; r++)
                System.out.printf("%c|%c|%c%n", b[r * 3], b[r * 3 + 1], b[r * 3 + 2]);
            boolean w = false;
            for (int i = 0; i < 3; i++)
                w |= b[i * 3] != ' ' && b[i * 3] == b[i * 3 + 1] && b[i * 3] == b[i * 3 + 2];
            w |= b[0] != ' ' && b[0] == b[4] && b[0] == b[8];
            w |= b[2] != ' ' && b[2] == b[4] && b[2] == b[6];
            if (w) {
                System.out.println("winner: " + p);
                return;
            }
        }
        System.out.println("draw");
    }
}
