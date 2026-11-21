#include <iostream>
struct TempFile {
  ~TempFile() { std::cout << "RAII cleanup\n"; }
  void write() { std::cout << "write report\n"; }
};
int main() {
  TempFile f;
  f.write();
}
