#include <stdio.h>
#include <stdlib.h>

int main(void) {
  int values[32];
  int length = 0;
  printf("Enter up to 32 integers (blank line to finish):\n");
  while (length < 32) {
    char line[64];
    if (!fgets(line, sizeof(line), stdin) || line[0] == '\n')
      break;
    values[length] = (int)strtol(line, NULL, 10);
    ++length;
  }
  if (length == 0) {
    int demo[] = {42, 7, 13, 2, 64, 1};
    length = 6;
    for (int i = 0; i < length; ++i)
      values[i] = demo[i];
  }

  for (int i = 1; i < length; i++) {
    int value = values[i];
    int j = i - 1;
    while (j >= 0 && values[j] > value) {
      values[j + 1] = values[j];
      j--;
    }
    values[j + 1] = value;
  }

  for (int i = 0; i < length; i++) {
    printf("%d%s", values[i], i + 1 == length ? "\n" : " ");
  }
  return 0;
}
