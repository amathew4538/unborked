#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 2+((2%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 2;
        NSLog(@"feature=ClosureCapture tier=8 seed=2 result=%ld", feature(2, value));
    }
    return 0;
}
