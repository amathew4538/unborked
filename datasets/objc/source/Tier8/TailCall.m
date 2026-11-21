#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = 70+((70%5)*7) + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 70;
        NSLog(@"feature=TailCall tier=8 seed=70 result=%ld", feature(70, value));
    }
    return 0;
}
