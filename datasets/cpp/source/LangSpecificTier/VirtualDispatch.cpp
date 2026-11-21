#include <iostream>
#include <memory>
#include <vector>
struct Printer {
  virtual ~Printer() = default;
  virtual void print() const = 0;
};
struct TextPrinter : Printer {
  void print() const override { std::cout << "text\n"; }
};
struct JsonPrinter : Printer {
  void print() const override { std::cout << "json\n"; }
};
int main() {
  std::vector<std::unique_ptr<Printer>> printers;
  printers.push_back(std::make_unique<TextPrinter>());
  printers.push_back(std::make_unique<JsonPrinter>());
  for (const auto &p : printers)
    p->print();
}
