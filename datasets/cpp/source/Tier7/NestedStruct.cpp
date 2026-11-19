#include <cstdio>
#include <cstdlib>
#include <cstdint>
#include <cmath>
#include <cstring>
#include <cstddef>
using std::printf; using std::puts;

struct Address{char city[32];int postcode;};struct User{char name[32];struct Address address;};int main(void){struct User u={"Lin",{"Seattle",98101}};printf("%s %s %d\n",u.name,u.address.city,u.address.postcode);}
