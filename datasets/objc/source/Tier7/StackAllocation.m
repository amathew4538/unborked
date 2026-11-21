#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (51%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 51;
        NSLog(@"feature=StackAllocation tier=7 seed=51 result=%ld", feature(51, value));
    }
    return 0;
}
