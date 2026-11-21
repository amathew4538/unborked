#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((18%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 18;
        NSLog(@"feature=InvalidShift tier=15 seed=18 result=%ld", feature(18, value));
    }
    return 0;
}
