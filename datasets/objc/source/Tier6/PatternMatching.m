#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 65*17+3 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 65;
        NSLog(@"feature=PatternMatching tier=6 seed=65 result=%ld", feature(65, value));
    }
    return 0;
}
