#import <Foundation/Foundation.h>

void voidFunction(){
    NSLog(@"Hello from the void function.");
}

NSString* returnFunction(){
    return @"Hello from the return function.";
}

int parameterFunction(int a){
    return a+1;
}

int main(){
    @autoreleasepool {
        voidFunction();
        NSLog(@"%@", returnFunction());
        NSLog(@"%d", parameterFunction(6));
    }
    return 0;
}
