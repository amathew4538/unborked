#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((17%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 17;
        NSLog(@"feature=LargeGlobalArray tier=15 seed=17 result=%ld", feature(17, value));
    }
    return 0;
}
