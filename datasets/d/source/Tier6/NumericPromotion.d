import std.conv : to;
import std.stdio : writeln;

int applyFeature(int value)
{
    return value * value + 3;
}

void main(string[] args)
{
    int value = args.length > 1 ? args[1].to!int : 42;
    writeln("feature=NumericPromotion value=", value, " result=", applyFeature(value));
}
