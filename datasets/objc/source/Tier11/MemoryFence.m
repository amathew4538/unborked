#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 1+(42%8) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 42;
        NSLog(@"feature=MemoryFence tier=11 seed=42 result=%ld", feature(42, value));
    }
    return 0;
}
