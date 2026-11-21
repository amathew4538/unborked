#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 67*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 67;
        NSLog(@"feature=IntegerUnderflow tier=6 seed=67 result=%ld", feature(67, value));
    }
    return 0;
}
