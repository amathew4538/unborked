#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

int get_id(const int *p) { return p ? p[0] : -1; }
int main(void) {
  int id = 42;
  printf("id=%d missing=%d\n", get_id(&id), get_id(NULL));
}
