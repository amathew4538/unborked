#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

#include <limits.h>
int main(void) {
  if (INT_MAX < INT_MAX + 1) {
    puts("overflow would wrap");
  } else
    puts("checked in advance");
}
