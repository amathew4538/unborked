#import <Foundation/Foundation.h>

int add(int a,int b) {
    return a + b;
}

int main() {
    @autoreleasepool {
        NSLog(@"%d", add(0,1));
        NSLog(@"%d", add(7,13));
        NSLog(@"%d", add(65536,1000));
        NSLog(@"%d", add(64,8));
        NSLog(@"%d", add(-42,-1));
    }
    
    return 0;
}
