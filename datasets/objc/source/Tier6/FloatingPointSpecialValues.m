#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 30*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 30;
        NSLog(@"feature=FloatingPointSpecialValues tier=6 seed=30 result=%ld", feature(30, value));
    }
    return 0;
}
