#include <stdio.h>
struct FieldInfo {
  const char *name;
  size_t offset;
};
int main(void) {
  struct FieldInfo fields[] = {"id", 0, "name", 4};
  for (int i = 0; i < 2; i++)
    printf("field=%s offset=%zu\n", fields[i].name, fields[i].offset);
}
