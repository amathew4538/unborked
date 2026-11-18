#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;

struct Result{double sum;double product;};struct Result calculate(double a,double b,double c,double d){struct Result r={a+b+c+d,a*b*c*d};return r;}int main(void){struct Result r=calculate(1,2,3,4);printf("sum=%.0f product=%.0f\n",r.sum,r.product);}
