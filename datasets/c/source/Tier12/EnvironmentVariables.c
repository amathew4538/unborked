#include <stdio.h>
#include <stdlib.h>
int main(void) {
  const char *home = getenv("HOME");
  printf("HOME=%s\n", home ? home : "<unset>");
}
