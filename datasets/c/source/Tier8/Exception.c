#include <stdio.h>
int parse_port(const char *s,int *out){int n=0;for(;*s;s++){if(*s<'0'||*s>'9')return -1;n=n*10+(*s-'0');}*out=n;return n<=65535?n: -1;}int main(void){int p;puts(parse_port("8080",&p)==0?"ok":"bad");}
