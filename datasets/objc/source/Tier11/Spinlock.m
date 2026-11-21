#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(34%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 34;
        NSLog(@"feature=Spinlock tier=11 seed=34 result=%ld", feature(34, value));
    }
    return 0;
}
