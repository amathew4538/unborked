#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 28*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 28;
        NSLog(@"feature=ImplicitConversion tier=6 seed=28 result=%ld", feature(28, value));
    }
    return 0;
}
