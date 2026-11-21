#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (68%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 68;
        NSLog(@"feature=References tier=7 seed=68 result=%ld", feature(68, value));
    }
    return 0;
}
