#import <Foundation/Foundation.h>

static long feature(long seed, long value) {
    long result = (78%11)+40 + seed + value;
    return result;
}

int main(int argc, const char * argv[]) {
    @autoreleasepool {
        long value = argc > 1 ? strtol(argv[1], NULL, 10) : 78;
        NSLog(@"feature=NameMangling tier=9 seed=78 result=%ld", feature(78, value));
    }
    return 0;
}
