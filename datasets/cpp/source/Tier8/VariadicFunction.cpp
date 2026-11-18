#include <cstdarg>
#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;


double average(int count,...){va_list ap;va_start(ap,count);double sum=0;for(int i=0;i<count;i++)sum+=va_arg(ap,double);va_end(ap);return sum/count;}int main(void){printf("average=%.2f\n",average(4,10.0,20.0,30.0,40.0));}
