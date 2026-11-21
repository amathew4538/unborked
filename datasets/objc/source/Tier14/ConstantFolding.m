#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (4*(4+1))/2 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 4;
        NSLog(@"feature=ConstantFolding tier=14 seed=4 result=%ld", feature(4, value));
    }
    return 0;
}
