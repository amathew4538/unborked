#include <atomic>
#include <iostream>
int main() {
  std::atomic<int> jobs{0};
  jobs.fetch_add(1);
  std::cout << "jobs=" << jobs.load() << "\n";
}
