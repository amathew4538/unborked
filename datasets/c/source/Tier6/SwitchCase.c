#include <stdio.h>
int main(void) {
  int code = 2;
  switch (code) {
  case 1:
    puts("connected");
    break;
  case 2:
    puts("processing");
    break;
  case 3:
    puts("complete");
    break;
  default:
    puts("unknown");
  }
}
