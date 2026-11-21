#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((94%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 94;
        NSLog(@"feature=OutOfBoundsAccess tier=15 seed=94 result=%ld", feature(94, value));
    }
    return 0;
}
