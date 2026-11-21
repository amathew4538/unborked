#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (39%64)*(39%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 39;
        NSLog(@"feature=QuickSort tier=13 seed=39 result=%ld", feature(39, value));
    }
    return 0;
}
