#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (8%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 8;
        NSLog(@"feature=VolatileAccess tier=7 seed=8 result=%ld", feature(8, value));
    }
    return 0;
}
