#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (25%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 25;
        NSLog(@"feature=MemoryMove tier=7 seed=25 result=%ld", feature(25, value));
    }
    return 0;
}
