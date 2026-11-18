#include <stdio.h>
#include <stdlib.h>
struct Node{int value;struct Node *next;};int main(void){struct Node *h=NULL,*tail=NULL;for(int i=1;i<=5;i++){struct Node*n=malloc(sizeof(*n));n->value=i;n->next=NULL;if(!h)h=n;else tail->next=n;tail=n;}for(struct Node*n=h;n;n=n->next)printf("%d%s",n->value,n->next?" ":"\n");while(h){struct Node*n=h;h=h->next;free(n);} }
