#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;

unsigned checksum(const unsigned char*s){unsigned h=2166136261u;while(*s)h=(h^(unsigned)*s++)*16777619u;return h;}int main(void){printf("config=%08X\n",checksum((const unsigned char*)"config:v1"));}
