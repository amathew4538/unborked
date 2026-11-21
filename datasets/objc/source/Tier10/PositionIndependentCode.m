#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 88+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 88;
        NSLog(@"feature=PositionIndependentCode tier=10 seed=88 result=%ld", feature(88, value));
    }
    return 0;
}
