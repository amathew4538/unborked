#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 11%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 11;
        NSLog(@"feature=FileRead tier=12 seed=11 result=%ld", feature(11, value));
    }
    return 0;
}
