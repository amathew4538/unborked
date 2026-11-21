#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (30%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 30;
        NSLog(@"feature=StaticMethods tier=9 seed=30 result=%ld", feature(30, value));
    }
    return 0;
}
