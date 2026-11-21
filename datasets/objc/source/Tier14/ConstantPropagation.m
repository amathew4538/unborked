#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (75*(75+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 75;
        NSLog(@"feature=ConstantPropagation tier=14 seed=75 result=%ld", feature(75, value));
    }
    return 0;
}
