#include <stdio.h>

int main(void) {
  char board[9] = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
  for (int turn = 0; turn < 9; ++turn) {
    char player = turn % 2 == 0 ? 'X' : 'O';
    int move;
    if (player == 'X') {
      printf("X move (1-9): ");
      fflush(stdout);
      if (scanf("%d", &move) != 1)
        move = 5;
    } else {
      move = 1;
      while (move <= 9 && board[move - 1] != ' ')
        ++move;
    }
    if (move < 1 || move > 9 || board[move - 1] != ' ')
      continue;
    board[move - 1] = player;
    for (int r = 0; r < 3; ++r)
      printf("%c|%c|%c\n", board[r * 3], board[r * 3 + 1], board[r * 3 + 2]);

    int won = 0;
    for (int i = 0; i < 3; ++i) {
      if (board[i * 3] != ' ' && board[i * 3] == board[i * 3 + 1] &&
          board[i * 3] == board[i * 3 + 2])
        won = 1;
      if (board[i] != ' ' && board[i] == board[i + 3] &&
          board[i] == board[i + 6])
        won = 1;
    }
    if (board[0] != ' ' && board[0] == board[4] && board[0] == board[8])
      won = 1;
    if (board[2] != ' ' && board[2] == board[4] && board[2] == board[6])
      won = 1;
    if (won) {
      printf("winner: %c\n", player);
      return 0;
    }
  }
  puts("draw");
  return 0;
}
