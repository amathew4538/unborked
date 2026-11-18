#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;

int main(void){unsigned x=0b10110110u,mask=0b00001111u;printf("0x%02X & 0x%02X = 0x%02X\n",x,mask,x&mask);return 0;}
