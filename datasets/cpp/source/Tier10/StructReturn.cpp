#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

typedef struct {
  int low;
  int high;
} Range;
Range make_range(int a, int b) {
  Range r = {a, b};
  return r;
}
int main(void) {
  Range r = make_range(10, 20);
  printf("range=%d..%d\n", r.low, r.high);
}
