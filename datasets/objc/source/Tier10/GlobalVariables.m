#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 66+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 66;
        NSLog(@"feature=GlobalVariables tier=10 seed=66 result=%ld", feature(66, value));
    }
    return 0;
}
