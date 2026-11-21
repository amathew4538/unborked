#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (37%64)*(37%64) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 37;
        NSLog(@"feature=HeapSort tier=13 seed=37 result=%ld", feature(37, value));
    }
    return 0;
}
