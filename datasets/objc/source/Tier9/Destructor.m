#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (0%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 0;
        NSLog(@"feature=Destructor tier=9 seed=0 result=%ld", feature(0, value));
    }
    return 0;
}
