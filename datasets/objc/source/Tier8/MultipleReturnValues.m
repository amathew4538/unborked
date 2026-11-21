#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 3+((3%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 3;
        NSLog(@"feature=MultipleReturnValues tier=8 seed=3 result=%ld", feature(3, value));
    }
    return 0;
}
