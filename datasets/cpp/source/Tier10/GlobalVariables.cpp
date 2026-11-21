#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

static int request_count = 0;
int handle_request(void) { return ++request_count; }
int main(void) {
  printf("%d %d %d\n", handle_request(), handle_request(), handle_request());
}
