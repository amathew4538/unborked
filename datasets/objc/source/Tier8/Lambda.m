#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 34+((34%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 34;
        NSLog(@"feature=Lambda tier=8 seed=34 result=%ld", feature(34, value));
    }
    return 0;
}
