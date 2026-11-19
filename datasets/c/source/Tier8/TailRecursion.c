#include <stdio.h>
unsigned sum_to(unsigned n,unsigned acc){return n==0?acc:sum_to(n-1,acc+n);}int main(void){printf("sum=%u\n",sum_to(100,0));}
