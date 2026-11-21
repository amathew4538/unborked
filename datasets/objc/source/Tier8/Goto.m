#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 18+((18%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 18;
        NSLog(@"feature=Goto tier=8 seed=18 result=%ld", feature(18, value));
    }
    return 0;
}
