#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int code = 2;
  switch (code) {
  case 1:
    puts("connected");
    break;
  case 2:
    puts("processing");
    break;
  case 3:
    puts("complete");
    break;
  default:
    puts("unknown");
  }
}
