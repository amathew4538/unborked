#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((23%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 23;
        NSLog(@"feature=IntegerBoundaryValues tier=15 seed=23 result=%ld", feature(23, value));
    }
    return 0;
}
