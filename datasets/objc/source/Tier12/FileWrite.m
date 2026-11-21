#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 43%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 43;
        NSLog(@"feature=FileWrite tier=12 seed=43 result=%ld", feature(43, value));
    }
    return 0;
}
