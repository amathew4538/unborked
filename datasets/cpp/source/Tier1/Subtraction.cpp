#include <cstdio>

int subtract(int a, int b) { return a - b; }

int main() {
  printf("%d\n", subtract(0, 1));
  printf("%d\n", subtract(7, 13));
  printf("%d\n", subtract(65536, 1000));
  printf("%d\n", subtract(64, 8));
  printf("%d\n", subtract(-42, -1));
}
