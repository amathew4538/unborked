#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (4%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 4;
        NSLog(@"feature=MemoryCopy tier=7 seed=4 result=%ld", feature(4, value));
    }
    return 0;
}
