#include <stdio.h>
#include <stddef.h>
struct R{char c;double d;int n;};int main(void){printf("size=%zu align(double)=%zu offsets c=%zu d=%zu n=%zu\n",sizeof(struct R),_Alignof(double),offsetof(struct R,c),offsetof(struct R,d),offsetof(struct R,n));}
