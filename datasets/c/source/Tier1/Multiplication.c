#include <stdio.h>

int multiply(int a, int b) { return a * b; }

int main() {
  printf("%d\n", multiply(0, 1));
  printf("%d\n", multiply(7, 13));
  printf("%d\n", multiply(65536, 1000));
  printf("%d\n", multiply(64, 8));
  printf("%d\n", multiply(-42, -1));
}
