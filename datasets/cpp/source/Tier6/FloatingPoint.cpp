#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  double x = -18.25;
  printf("sqrt=%g sin=%g abs=%g\n", sqrt(fabs(x)), sin(x), fabs(x));
  return 0;
}
