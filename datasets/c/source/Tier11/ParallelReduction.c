#include <stdio.h>
int main(void) {
  int values[] = {2, 4, 6, 8, 10};
  int sum = 0;
  for (unsigned i = 0; i < sizeof(values) / sizeof(values[0]); i++)
    sum += values[i];
  printf("sum=%d\n", sum);
}
