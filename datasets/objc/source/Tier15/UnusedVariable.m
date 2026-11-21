#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((66%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 66;
        NSLog(@"feature=UnusedVariable tier=15 seed=66 result=%ld", feature(66, value));
    }
    return 0;
}
