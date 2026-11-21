#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((60%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 60;
        NSLog(@"feature=UninitializedVariable tier=15 seed=60 result=%ld", feature(60, value));
    }
    return 0;
}
