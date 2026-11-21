#include <iostream>
struct Score {
  int value;
  Score operator+(const Score &other) const { return {value + other.value}; }
  friend std::ostream &operator<<(std::ostream &o, const Score &s) {
    return o << s.value;
  }
};
int main() {
  Score total = Score{40} + Score{2};
  std::cout << "score=" << total << "\n";
}
