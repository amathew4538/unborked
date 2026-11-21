#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((79%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 79;
        NSLog(@"feature=EmptyFunction tier=15 seed=79 result=%ld", feature(79, value));
    }
    return 0;
}
