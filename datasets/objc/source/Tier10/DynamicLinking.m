#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 91+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 91;
        NSLog(@"feature=DynamicLinking tier=10 seed=91 result=%ld", feature(91, value));
    }
    return 0;
}
