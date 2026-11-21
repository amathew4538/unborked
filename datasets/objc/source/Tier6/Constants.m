#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 27*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 27;
        NSLog(@"feature=Constants tier=6 seed=27 result=%ld", feature(27, value));
    }
    return 0;
}
