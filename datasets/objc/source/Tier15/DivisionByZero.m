#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((92%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 92;
        NSLog(@"feature=DivisionByZero tier=15 seed=92 result=%ld", feature(92, value));
    }
    return 0;
}
