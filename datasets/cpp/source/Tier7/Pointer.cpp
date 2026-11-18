#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;

int main(void){int value=42;int *p=&value;*p+=8;printf("value=%d via_pointer=%d\n",value,*p);}
