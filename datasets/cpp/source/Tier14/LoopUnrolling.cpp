#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  int sum = 0;
  for (int i = 0; i < 16; i++)
    sum += i * i;
  printf("sum=%d\n", sum);
}
