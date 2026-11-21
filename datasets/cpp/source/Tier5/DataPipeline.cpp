#include <stdio.h>

int main(void) {
  char line[256];
  int valid = 0, invalid = 0, total = 0;
  puts("Enter CSV rows as name,amount (blank line to finish):");
  while (fgets(line, sizeof(line), stdin) && line[0] != '\n') {
    char name[128];
    int amount;
    if (sscanf(line, " %127[^,],%d", name, &amount) == 2) {
      ++valid;
      total += amount;
      printf("accepted %s: %d\n", name, amount);
    } else {
      ++invalid;
      printf("rejected: %s", line);
    }
  }
  printf("summary valid=%d invalid=%d total=%d\n", valid, invalid, total);
  return 0;
}
