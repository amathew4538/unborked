#include <fstream>
#include <iostream>
#include <string>
struct ReportFile{std::ofstream stream;ReportFile(const char*path):stream(path){if(stream)stream<<"status=ok\n";}~ReportFile(){if(stream.is_open())stream.close();std::cout<<"report closed\n";}};
int main(){ReportFile report("raii-report.txt");std::remove("raii-report.txt");}
