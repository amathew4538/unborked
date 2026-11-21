#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

struct R {
  char c;
  double d;
  int n;
};
int main(void) {
  printf("size=%zu align(double)=%zu offsets c=%zu d=%zu n=%zu\n",
         sizeof(struct R), alignof(double), offsetof(struct R, c),
         offsetof(struct R, d), offsetof(struct R, n));
}
