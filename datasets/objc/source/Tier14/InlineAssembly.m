#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (28*(28+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 28;
        NSLog(@"feature=InlineAssembly tier=14 seed=28 result=%ld", feature(28, value));
    }
    return 0;
}
