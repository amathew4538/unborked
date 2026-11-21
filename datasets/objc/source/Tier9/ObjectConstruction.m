#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (93%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 93;
        NSLog(@"feature=ObjectConstruction tier=9 seed=93 result=%ld", feature(93, value));
    }
    return 0;
}
