#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (20%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 20;
        NSLog(@"feature=PassByReference tier=7 seed=20 result=%ld", feature(20, value));
    }
    return 0;
}
