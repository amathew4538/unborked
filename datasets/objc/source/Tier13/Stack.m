#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (82%64)*(82%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 82;
        NSLog(@"feature=Stack tier=13 seed=82 result=%ld", feature(82, value));
    }
    return 0;
}
