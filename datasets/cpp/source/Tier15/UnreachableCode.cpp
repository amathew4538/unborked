#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  puts("start");
  if (1) {
    puts("reachable");
    return 0;
  }
  puts("unreachable");
  return 1;
}
