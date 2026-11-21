#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (48%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 48;
        NSLog(@"feature=Interface tier=9 seed=48 result=%ld", feature(48, value));
    }
    return 0;
}
