#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 95%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 95;
        NSLog(@"feature=SignalHandling tier=12 seed=95 result=%ld", feature(95, value));
    }
    return 0;
}
