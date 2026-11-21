#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(71%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 71;
        NSLog(@"feature=AsyncAwait tier=11 seed=71 result=%ld", feature(71, value));
    }
    return 0;
}
