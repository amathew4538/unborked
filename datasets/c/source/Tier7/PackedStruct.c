#include <stddef.h>
#include <stdio.h>
#pragma pack(push, 1)
struct Packet {
  unsigned char type;
  unsigned short length;
  unsigned int flags;
};
#pragma pack(pop)
int main(void) {
  struct Packet p = {3, 1400, 0xA5};
  printf("size=%zu type=%u length=%u flags=%X\n", sizeof(p), p.type, p.length,
         p.flags);
}
