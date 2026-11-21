#include <stdio.h>
int safe_divide(int a, int b, int *out) {
  if (b == 0)
    return 0;
  *out = a / b;
  return 1;
}
int main(void) {
  int q;
  printf("10/0=%s\n", safe_divide(10, 0, &q) ? "ok" : "invalid");
}
