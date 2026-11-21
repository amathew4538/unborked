#include <iostream>
#include <memory>
#include <vector>
struct Shape {
  virtual ~Shape() = default;
  virtual void draw() const = 0;
};
struct Circle : Shape {
  void draw() const override { std::cout << "circle\n"; }
};
struct Square : Shape {
  void draw() const override { std::cout << "square\n"; }
};
int main() {
  std::vector<std::unique_ptr<Shape>> shapes;
  shapes.push_back(std::make_unique<Circle>());
  shapes.push_back(std::make_unique<Square>());
  for (const auto &s : shapes)
    s->draw();
}
