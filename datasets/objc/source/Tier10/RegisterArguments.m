#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 64+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 64;
        NSLog(@"feature=RegisterArguments tier=10 seed=64 result=%ld", feature(64, value));
    }
    return 0;
}
