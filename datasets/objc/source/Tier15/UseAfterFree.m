#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((36%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 36;
        NSLog(@"feature=UseAfterFree tier=15 seed=36 result=%ld", feature(36, value));
    }
    return 0;
}
