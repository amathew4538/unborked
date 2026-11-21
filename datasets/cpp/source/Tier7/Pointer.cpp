#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int value = 42;
  int *p = &value;
  *p += 8;
  printf("value=%d via_pointer=%d\n", value, *p);
}
