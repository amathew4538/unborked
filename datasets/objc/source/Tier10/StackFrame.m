#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 90+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 90;
        NSLog(@"feature=StackFrame tier=10 seed=90 result=%ld", feature(90, value));
    }
    return 0;
}
