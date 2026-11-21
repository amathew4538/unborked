#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int a[] = {10, 20, 30, 40};
  int *p = a;
  for (int i = 0; i < 4; i++, p++)
    printf("%d@%td\n", *p, p - a);
  printf("total=%d\n", a[0] + a[3]);
}
