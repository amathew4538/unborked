#include <stdio.h>
int main(void){int a[1024],b[1024],c[1024];for(int i=0;i<1024;i++){a[i]=i;b[i]=i*2;}for(int i=0;i<1024;i++)c[i]=a[i]+b[i];printf("tail=%d\n",c[1023]);}
