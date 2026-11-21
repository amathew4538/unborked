#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 24*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 24;
        NSLog(@"feature=BitwiseOr tier=6 seed=24 result=%ld", feature(24, value));
    }
    return 0;
}
