#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int add(int a, int b) { return a + b; }
int mul(int a, int b) { return a * b; }
int main(void) {
  int (*op)(int, int) = add;
  printf("add=%d\n", op(7, 5));
  op = mul;
  printf("mul=%d\n", op(7, 5));
}
