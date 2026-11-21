#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 100/((59%9)+1) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 59;
        NSLog(@"feature=DeepRecursion tier=15 seed=59 result=%ld", feature(59, value));
    }
    return 0;
}
