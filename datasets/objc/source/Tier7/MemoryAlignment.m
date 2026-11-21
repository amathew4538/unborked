#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (44%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 44;
        NSLog(@"feature=MemoryAlignment tier=7 seed=44 result=%ld", feature(44, value));
    }
    return 0;
}
