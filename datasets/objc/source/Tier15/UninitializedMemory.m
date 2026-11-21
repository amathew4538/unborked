#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((67%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 67;
        NSLog(@"feature=UninitializedMemory tier=15 seed=67 result=%ld", feature(67, value));
    }
    return 0;
}
