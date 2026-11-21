#include <iostream>
#include <string>
template <class T> T maximum(T a, T b) { return a > b ? a : b; }
int main() {
  std::cout << maximum(12, 29) << " "
            << maximum(std::string("Ada"), std::string("Lin")) << "\n";
}
