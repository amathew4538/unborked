#include <cstdio>

int main(void) {
    char board[3][3] = {
        {'X', 'O', 'X'},
        {'O', 'X', 'O'},
        {'X', 'O', 'X'},
    };

    for (int row = 0; row < 3; row++) {
        printf("%c %c %c\n", board[row][0], board[row][1], board[row][2]);
    }

    printf("winner: X\n");
    return 0;
}
