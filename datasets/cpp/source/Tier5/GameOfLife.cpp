#include <cstdio>

int main(void) {
    int grid[5][5] = {0};
    grid[1][2] = grid[2][2] = grid[3][2] = 1;

    int next[5][5] = {0};
    for (int row = 0; row < 5; row++) {
        for (int column = 0; column < 5; column++) {
            int neighbours = 0;
            for (int dy = -1; dy <= 1; dy++) {
                for (int dx = -1; dx <= 1; dx++) {
                    if (dx == 0 && dy == 0) continue;
                    int y = row + dy;
                    int x = column + dx;
                    if (y >= 0 && y < 5 && x >= 0 && x < 5) {
                        neighbours += grid[y][x];
                    }
                }
            }
            next[row][column] = neighbours == 3 || (grid[row][column] && neighbours == 2);
        }
    }

    printf("generation: 1\n");
    for (int row = 0; row < 5; row++) {
        for (int column = 0; column < 5; column++) {
            putchar(next[row][column] ? '#' : '.');
        }
        putchar('\n');
    }
    return 0;
}
