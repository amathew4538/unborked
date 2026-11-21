#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int main(void) {
  const char *home = getenv("HOME");
  printf("HOME=%s\n", home ? home : "<unset>");
}
