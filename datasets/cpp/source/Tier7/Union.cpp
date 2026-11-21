#include <cmath>
#include <cstddef>
#include <cstdint>
#include <cstdio>
#include <cstdlib>
#include <cstring>
using std::printf;
using std::puts;

union Packet {
  uint32_t bits;
  unsigned char bytes[4];
};
int main(void) {
  union Packet p = {.bits = 0x12345678};
  printf("0x%08X bytes=%02X %02X %02X %02X\n", p.bits, p.bytes[0], p.bytes[1],
         p.bytes[2], p.bytes[3]);
}
