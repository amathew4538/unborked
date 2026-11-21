#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 16%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 16;
        NSLog(@"feature=BufferedIO tier=12 seed=16 result=%ld", feature(16, value));
    }
    return 0;
}
