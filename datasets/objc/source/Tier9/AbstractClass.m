#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (59%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 59;
        NSLog(@"feature=AbstractClass tier=9 seed=59 result=%ld", feature(59, value));
    }
    return 0;
}
