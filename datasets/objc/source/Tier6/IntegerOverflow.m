#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 85*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 85;
        NSLog(@"feature=IntegerOverflow tier=6 seed=85 result=%ld", feature(85, value));
    }
    return 0;
}
