#include <iostream>
#include <thread>
int main(){int n=12;std::thread worker([n]{std::cout<<"worker processed "<<(n*n)<<"\n";});worker.join();}
