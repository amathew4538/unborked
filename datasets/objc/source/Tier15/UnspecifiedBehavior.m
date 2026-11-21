#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((62%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 62;
        NSLog(@"feature=UnspecifiedBehavior tier=15 seed=62 result=%ld", feature(62, value));
    }
    return 0;
}
