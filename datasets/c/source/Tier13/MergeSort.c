#include <stdio.h>
#include <stdlib.h>
void merge_sort(int*a,int n){if(n<2)return;int m=n/2;merge_sort(a,m);merge_sort(a+m,n-m);int*i=malloc(n*sizeof(*i));if(!i)return;int p=0,q=m,k=0;while(p<m&&q<n)i[k++]=a[p]<a[q]?a[p++]:a[q++];while(p<m)i[k++]=a[p++];while(q<n)i[k++]=a[q++];for(k=0;k<n;k++)a[k]=i[k];free(i);}int main(void){int a[]={5,1,4,2,3};merge_sort(a,5);for(int i=0;i<5;i++)printf("%d%s",a[i],i<4?" ":"\n");}
