#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(72%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 72;
        NSLog(@"feature=AtomicAdd tier=11 seed=72 result=%ld", feature(72, value));
    }
    return 0;
}
