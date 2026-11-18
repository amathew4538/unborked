package datasets.java.source.Tier5;

public class GameOfLife {
    public static void main(String[] args) {
        boolean[][] grid = new boolean[5][5];
        grid[1][2] = grid[2][2] = grid[3][2] = true;
        boolean[][] next = new boolean[5][5];
        for (int row = 0; row < 5; row++) {
            for (int column = 0; column < 5; column++) {
                int neighbours = 0;
                for (int dy = -1; dy <= 1; dy++) {
                    for (int dx = -1; dx <= 1; dx++) {
                        if (dx == 0 && dy == 0) continue;
                        int y = row + dy;
                        int x = column + dx;
                        if (y >= 0 && y < 5 && x >= 0 && x < 5 && grid[y][x]) neighbours++;
                    }
                }
                next[row][column] = neighbours == 3 || (grid[row][column] && neighbours == 2);
            }
        }
        System.out.println("generation: 1");
        for (boolean[] row : next) {
            for (boolean cell : row) System.out.print(cell ? '#' : '.');
            System.out.println();
        }
    }
}
