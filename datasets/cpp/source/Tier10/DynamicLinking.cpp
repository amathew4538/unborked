#include <dlfcn.h>
#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;



int main(void){void *h=dlopen(NULL,RTLD_NOW);double (*sqrt_fn)(double)=h?(double (*)(double))dlsym(h,"sqrt"):NULL;printf("dlsym sqrt(81)=%.0f\n",sqrt_fn?sqrt_fn(81.0):-1.0);if(h)dlclose(h);}
