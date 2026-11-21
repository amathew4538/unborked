#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (7*(7+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 7;
        NSLog(@"feature=VectorOperations tier=14 seed=7 result=%ld", feature(7, value));
    }
    return 0;
}
