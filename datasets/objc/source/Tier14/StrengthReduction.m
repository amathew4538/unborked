#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (58*(58+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 58;
        NSLog(@"feature=StrengthReduction tier=14 seed=58 result=%ld", feature(58, value));
    }
    return 0;
}
