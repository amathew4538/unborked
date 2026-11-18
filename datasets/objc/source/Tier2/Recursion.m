#import <Foundation/Foundation.h>

int factorial(int n){
    return n<=1?1:n*factorial(n-1);
}

int main(){
    @autoreleasepool {
        NSLog(@"%d",factorial(5));
    }

    return 0;
}
