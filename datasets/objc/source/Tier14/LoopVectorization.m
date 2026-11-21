#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (13*(13+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 13;
        NSLog(@"feature=LoopVectorization tier=14 seed=13 result=%ld", feature(13, value));
    }
    return 0;
}
