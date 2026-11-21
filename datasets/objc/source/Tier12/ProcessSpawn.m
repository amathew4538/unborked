#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 63%1024 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 63;
        NSLog(@"feature=ProcessSpawn tier=12 seed=63 result=%ld", feature(63, value));
    }
    return 0;
}
