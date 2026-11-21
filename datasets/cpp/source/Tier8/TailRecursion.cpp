#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

unsigned sum_to(unsigned n, unsigned acc) {
  return n == 0 ? acc : sum_to(n - 1, acc + n);
}
int main(void) { printf("sum=%u\n", sum_to(100, 0)); }
