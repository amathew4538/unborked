#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 77+32 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 77;
        NSLog(@"feature=DynamicInitialization tier=10 seed=77 result=%ld", feature(77, value));
    }
    return 0;
}
