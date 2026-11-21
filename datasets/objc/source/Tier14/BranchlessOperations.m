#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (92*(92+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 92;
        NSLog(@"feature=BranchlessOperations tier=14 seed=92 result=%ld", feature(92, value));
    }
    return 0;
}
