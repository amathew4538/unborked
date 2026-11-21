#include <limits.h>
#include <stdio.h>
int main(void) {
  if (INT_MAX < INT_MAX + 1) {
    puts("overflow would wrap");
  } else
    puts("checked in advance");
}
