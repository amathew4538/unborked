#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (31%64)*(31%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 31;
        NSLog(@"feature=AvlTree tier=13 seed=31 result=%ld", feature(31, value));
    }
    return 0;
}
