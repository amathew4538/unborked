#include <cstdio>

int main() {
  int values[] = {2, 4, 6, 8, 10};
  int sum = 0;
  for (int i = 0; i < 5; i++) {
    printf("%d\n", values[i]);
    sum += values[i];
  }
  printf("%d\n", sum);
}
