#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  unsigned x = 1;
  for (int i = 0; i < 8; i++)
    printf("%u -> %u\n", x, x << i);
  return 0;
}
