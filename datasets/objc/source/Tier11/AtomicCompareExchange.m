#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(52%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 52;
        NSLog(@"feature=AtomicCompareExchange tier=11 seed=52 result=%ld", feature(52, value));
    }
    return 0;
}
