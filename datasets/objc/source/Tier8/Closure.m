#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 45+((45%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 45;
        NSLog(@"feature=Closure tier=8 seed=45 result=%ld", feature(45, value));
    }
    return 0;
}
