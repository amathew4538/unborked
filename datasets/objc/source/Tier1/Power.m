#import <Foundation/Foundation.h>
int power(int a,int b){ int r=1; for(int i=0;i<b;i++) r*=a; return r; }
int main(){ @autoreleasepool { NSLog(@"%d",power(2,8)); NSLog(@"%d",power(3,4)); } return 0; }
