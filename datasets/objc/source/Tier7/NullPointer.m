#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (73%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 73;
        NSLog(@"feature=NullPointer tier=7 seed=73 result=%ld", feature(73, value));
    }
    return 0;
}
