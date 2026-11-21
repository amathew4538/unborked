#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(46%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 46;
        NSLog(@"feature=AtomicLoad tier=11 seed=46 result=%ld", feature(46, value));
    }
    return 0;
}
