#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (32*(32+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 32;
        NSLog(@"feature=DeadCodeElimination tier=14 seed=32 result=%ld", feature(32, value));
    }
    return 0;
}
