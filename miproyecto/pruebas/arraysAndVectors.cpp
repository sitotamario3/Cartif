#include <iostream>
#include <vector>

int main(){
    int array[3] = {1,2,3};

    std::vector<int> vectr = {95, 32, 81};

    vectr.push_back(95);
    vectr.pop_back();

    std::cout << vectr.at(30) << std::endl;

    return 0;
}