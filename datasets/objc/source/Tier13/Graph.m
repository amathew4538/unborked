#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (6%64)*(6%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 6;
        NSLog(@"feature=Graph tier=13 seed=6 result=%ld", feature(6, value));
    }
    return 0;
}
