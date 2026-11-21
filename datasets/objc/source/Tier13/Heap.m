#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (43%64)*(43%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 43;
        NSLog(@"feature=Heap tier=13 seed=43 result=%ld", feature(43, value));
    }
    return 0;
}
