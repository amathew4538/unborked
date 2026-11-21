#include <stdio.h>
int countdown(int n) {
  if (n == 0)
    return 0;
  return countdown(n - 1);
}
int main(void) { printf("countdown=%d\n", countdown(10000)); }
