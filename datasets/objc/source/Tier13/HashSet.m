#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (47%64)*(47%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 47;
        NSLog(@"feature=HashSet tier=13 seed=47 result=%ld", feature(47, value));
    }
    return 0;
}
