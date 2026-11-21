#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int a[3][4];
  printf("row2=%td bytes\n", (char *)&a[1][0] - (char *)&a[0][0]);
  printf("element0=%p element1=%p\n", (void *)&a[0][0], (void *)&a[0][1]);
}
