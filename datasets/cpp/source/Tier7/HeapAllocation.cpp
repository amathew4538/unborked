#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;


int main(void){size_t n=8;int *v=(int*)malloc(n*sizeof(*v));if(!v)return 1;for(size_t i=0;i<n;i++)v[i]=(int)i*i;for(size_t i=0;i<n;i++)printf("%d%s",v[i],i+1<n?" ":"\n");free(v);}
