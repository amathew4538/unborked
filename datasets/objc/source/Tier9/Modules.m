#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (11%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 11;
        NSLog(@"feature=Modules tier=9 seed=11 result=%ld", feature(11, value));
    }
    return 0;
}
