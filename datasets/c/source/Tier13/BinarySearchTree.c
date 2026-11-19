#include <stdio.h>
struct Node{int v;struct Node*l,*r;};int find(struct Node*n,int v){while(n){if(v==n->v)return 1;n=v<n->v?n->l:n->r;}return 0;}int main(void){struct Node c={4,NULL,NULL},b={2,NULL,NULL},d={6,NULL,NULL},a={1,&b,&c};b.r=&d;printf("found 6=%d found 5=%d\n",find(&a,6),find(&a,5));}
