#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 29+((29%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 29;
        NSLog(@"feature=Exception tier=8 seed=29 result=%ld", feature(29, value));
    }
    return 0;
}
