#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 21*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 21;
        NSLog(@"feature=FloatingPoint tier=6 seed=21 result=%ld", feature(21, value));
    }
    return 0;
}
