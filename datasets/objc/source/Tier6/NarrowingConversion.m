#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 93*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 93;
        NSLog(@"feature=NarrowingConversion tier=6 seed=93 result=%ld", feature(93, value));
    }
    return 0;
}
