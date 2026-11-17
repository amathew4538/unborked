#import <Foundation/Foundation.h>
int multiply(int a,int b) { return a * b; }
int main() { @autoreleasepool { NSLog(@"%d", multiply(0,1)); NSLog(@"%d", multiply(7,13)); NSLog(@"%d", multiply(65536,1000)); NSLog(@"%d", multiply(64,8)); NSLog(@"%d", multiply(-42,-1)); } return 0; }
