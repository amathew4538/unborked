#include <stdio.h>
int main(void) {
  int value = 42;
  if (value >= 0 && value < 10)
    puts("small");
  else if (value < 100)
    puts("medium");
  else
    puts("large");
  return 0;
}
