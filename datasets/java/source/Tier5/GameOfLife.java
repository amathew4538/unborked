public class GameOfLife {
    public static void main(String[] a) {
        int[][] g = new int[5][5];
        g[1][2] = g[2][2] = g[3][2] = 1;
        for (int gen = 1; gen <= 5; gen++) {
            int[][] n = new int[5][5];
            for (int r = 0; r < 5; r++)
                for (int c = 0; c < 5; c++) {
                    int x = 0;
                    for (int dr = -1; dr <= 1; dr++)
                        for (int dc = -1; dc <= 1; dc++) {
                            if (dr == 0 && dc == 0)
                                continue;
                            int y = r + dr, z = c + dc;
                            if (y >= 0 && y < 5 && z >= 0 && z < 5)
                                x += g[y][z];
                        }
                    n[r][c] = x == 3 || (g[r][c] == 1 && x == 2) ? 1 : 0;
                }
            g = n;
            System.out.println("generation: " + gen);
            for (int[] row : g) {
                for (int x : row)
                    System.out.print(x == 1 ? '#' : '.');
                System.out.println();
            }
        }
    }
}
