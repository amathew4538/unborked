#include <stdio.h>
static int unused(int x){return x*x;}int main(void){int live=21*2;if(0){puts("dead branch");}printf("live=%d\n",live);}
