#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (38%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 38;
        NSLog(@"feature=Macros tier=9 seed=38 result=%ld", feature(38, value));
    }
    return 0;
}
