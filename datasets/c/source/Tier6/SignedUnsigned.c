#include <stdio.h>
#include <stdint.h>
int main(void){int32_t signed_value=-1;uint32_t unsigned_value=(uint32_t)signed_value;printf("signed=%d unsigned=%u\n",signed_value,unsigned_value);return 0;}
