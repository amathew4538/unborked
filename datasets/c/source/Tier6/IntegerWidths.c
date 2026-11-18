#include <stdio.h>
#include <stdint.h>
int main(void){uint64_t u=UINT64_MAX;int64_t s=(int64_t)u;printf("u=%llu s=%lld\n",(unsigned long long)u,(long long)s);uint8_t small=(uint8_t)300;printf("narrow=%u\n",(unsigned)small);return 0;}
