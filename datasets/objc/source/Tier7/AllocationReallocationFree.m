#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (57%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 57;
        NSLog(@"feature=AllocationReallocationFree tier=7 seed=57 result=%ld", feature(57, value));
    }
    return 0;
}
