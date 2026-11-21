#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 87*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 87;
        NSLog(@"feature=FloatingPointRounding tier=6 seed=87 result=%ld", feature(87, value));
    }
    return 0;
}
