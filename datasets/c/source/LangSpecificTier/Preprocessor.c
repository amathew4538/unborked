#include <stdio.h>
#define BUFFER_SIZE 64
#define SCALE 100
int main(void) {
  char output[BUFFER_SIZE];
  snprintf(output, sizeof output, "price=%d", SCALE * 3);
  puts(output);
  return 0;
}
