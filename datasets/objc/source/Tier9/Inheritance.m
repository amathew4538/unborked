#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (1%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 1;
        NSLog(@"feature=Inheritance tier=9 seed=1 result=%ld", feature(1, value));
    }
    return 0;
}
