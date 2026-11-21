#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int value = 42;
  if (value >= 0 && value < 10)
    puts("small");
  else if (value < 100)
    puts("medium");
  else
    puts("large");
  return 0;
}
