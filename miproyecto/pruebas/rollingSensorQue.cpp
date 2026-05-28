#include <iostream>
#include <vector>

int main(){
    /*Write a script where you:

    Initialize a vector with three starting distance readings: 15, 30, 45.

    Delete the first (oldest) element in the vector using .erase().

    Add a brand new sensor reading (60) to the end of the vector.

    Print out the final size and the elements to prove the queue rolled forward properly.*/

    std::vector<int> v = {15, 30, 45};

    v.erase(v.begin());

    v.push_back(60);

    std::cout << "Size: " << v.size() << std::endl;

    for (int i = 0; i < v.size(); i++) {
        std::cout << v[i] << " ";
    }

    return 0;
}