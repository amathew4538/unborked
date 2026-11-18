#include <stdio.h>
int get_element(const int*a,size_t n,size_t i){return i<n?a[i]:-1;}int main(void){int a[]={4,8,15,16};printf("i2=%d i9=%d\n",get_element(a,4,2),get_element(a,4,9));}
