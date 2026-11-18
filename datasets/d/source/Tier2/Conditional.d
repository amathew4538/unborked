import std.stdio;

string classify(int n) {
    if (n < 0) return "negative";
    if (n > 0) return "positive";
    return "zero";
}

void main() {
    writeln(classify(-1));
    writeln(classify(0));
    writeln(classify(1));
}
