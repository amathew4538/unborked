#include <stdio.h>
#include <stdatomic.h>
int main(void){atomic_int jobs=0;atomic_fetch_add(&jobs,1);printf("jobs=%d\n",atomic_load(&jobs));}
