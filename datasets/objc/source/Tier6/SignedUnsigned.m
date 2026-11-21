#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 9*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 9;
        NSLog(@"feature=SignedUnsigned tier=6 seed=9 result=%ld", feature(9, value));
    }
    return 0;
}
