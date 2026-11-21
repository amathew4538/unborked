#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 83%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 83;
        NSLog(@"feature=NetworkClient tier=12 seed=83 result=%ld", feature(83, value));
    }
    return 0;
}
