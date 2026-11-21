#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int s[] = {0};
  int top = -1;
  for (int i = 1; i <= 5; i++)
    s[++top] = i;
  printf("top=%d\n", s[top]);
  while (top >= 0)
    printf("pop=%d\n", s[top--]);
}
