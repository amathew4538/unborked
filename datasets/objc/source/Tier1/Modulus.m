#import <Foundation/Foundation.h>
int modulo(int a,int b) { return a % b; }
int main() { @autoreleasepool { NSLog(@"%d", modulo(0,1)); NSLog(@"%d", modulo(7,13)); NSLog(@"%d", modulo(65536,1000)); NSLog(@"%d", modulo(64,8)); NSLog(@"%d", modulo(-42,-1)); } return 0; }
