#include <iostream>
#include <mutex>
int main(){std::mutex lock;int balance=100;{std::lock_guard<std::mutex> guard(lock);balance+=25;}std::cout<<"balance="<<balance<<"\n";}
