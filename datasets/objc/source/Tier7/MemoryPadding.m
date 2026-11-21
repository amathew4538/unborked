#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (84%16)*4 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 84;
        NSLog(@"feature=MemoryPadding tier=7 seed=84 result=%ld", feature(84, value));
    }
    return 0;
}
