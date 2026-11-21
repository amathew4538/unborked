#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (5*(5+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 5;
        NSLog(@"feature=BranchElimination tier=14 seed=5 result=%ld", feature(5, value));
    }
    return 0;
}
