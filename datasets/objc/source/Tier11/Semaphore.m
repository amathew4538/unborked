#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(29%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 29;
        NSLog(@"feature=Semaphore tier=11 seed=29 result=%ld", feature(29, value));
    }
    return 0;
}
