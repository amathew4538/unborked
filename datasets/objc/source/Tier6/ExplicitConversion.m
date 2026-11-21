#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 46*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 46;
        NSLog(@"feature=ExplicitConversion tier=6 seed=46 result=%ld", feature(46, value));
    }
    return 0;
}
