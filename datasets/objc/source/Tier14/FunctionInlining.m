#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (41*(41+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 41;
        NSLog(@"feature=FunctionInlining tier=14 seed=41 result=%ld", feature(41, value));
    }
    return 0;
}
