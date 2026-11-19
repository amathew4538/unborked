#include <stdio.h>
#include <stdlib.h>
#include <dlfcn.h>
int main(void){void *h=dlopen(NULL,RTLD_NOW);double (*sqrt_fn)(double)=h?dlsym(h,"sqrt"):NULL;printf("dlsym sqrt(81)=%.0f\n",sqrt_fn?sqrt_fn(81.0):-1.0);if(h)dlclose(h);}
