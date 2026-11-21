#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (81%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 81;
        NSLog(@"feature=VirtualFunction tier=9 seed=81 result=%ld", feature(81, value));
    }
    return 0;
}
