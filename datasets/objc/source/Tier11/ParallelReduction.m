#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(45%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 45;
        NSLog(@"feature=ParallelReduction tier=11 seed=45 result=%ld", feature(45, value));
    }
    return 0;
}
