#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

static int unused(int x) { return x * x; }
int main(void) {
  int live = 21 * 2;
  if (0) {
    puts("dead branch");
  }
  printf("live=%d\n", live);
}
