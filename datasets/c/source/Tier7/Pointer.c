#include <stdio.h>
int main(void) {
  int value = 42;
  int *p = &value;
  *p += 8;
  printf("value=%d via_pointer=%d\n", value, *p);
}
