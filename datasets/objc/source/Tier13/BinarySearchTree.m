#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (74%64)*(74%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 74;
        NSLog(@"feature=BinarySearchTree tier=13 seed=74 result=%ld", feature(74, value));
    }
    return 0;
}
