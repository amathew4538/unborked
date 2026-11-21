#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (59*(59+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 59;
        NSLog(@"feature=TailCallOptimization tier=14 seed=59 result=%ld", feature(59, value));
    }
    return 0;
}
