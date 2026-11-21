#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 35+((35%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 35;
        NSLog(@"feature=Generator tier=8 seed=35 result=%ld", feature(35, value));
    }
    return 0;
}
