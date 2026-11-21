#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

#define SCALE(x, y) ((x) * (y))
#define ARRAY_SIZE(a) (sizeof(a) / sizeof((a)[0]))
int main(void) {
  int v[] = {1, 2, 3};
  printf("scaled=%d count=%zu\n", SCALE(6, 7), ARRAY_SIZE(v));
}
