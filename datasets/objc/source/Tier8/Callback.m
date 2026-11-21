#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 49+((49%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 49;
        NSLog(@"feature=Callback tier=8 seed=49 result=%ld", feature(49, value));
    }
    return 0;
}
