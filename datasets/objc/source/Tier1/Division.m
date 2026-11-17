#import <Foundation/Foundation.h>
int divide(int a,int b) { return a / b; }
int main() { @autoreleasepool { NSLog(@"%d", divide(0,1)); NSLog(@"%d", divide(7,13)); NSLog(@"%d", divide(65536,1000)); NSLog(@"%d", divide(64,8)); NSLog(@"%d", divide(-42,-1)); } return 0; }
