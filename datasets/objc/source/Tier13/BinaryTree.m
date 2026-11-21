#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (83%64)*(83%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 83;
        NSLog(@"feature=BinaryTree tier=13 seed=83 result=%ld", feature(83, value));
    }
    return 0;
}
