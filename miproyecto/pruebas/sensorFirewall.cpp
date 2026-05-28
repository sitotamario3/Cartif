#include <iostream>
#include <vector>

/*In both robotics and cyber physical systems, you have to filter out "noisy" or malicious data. If a sensor suddenly reports a value that is physically impossible, the system needs to strip it out.

Your Task:

    Write a function called filterSanitize.

        It should take a reference to a vector of integers (std::vector<int> &readings).

        It should return nothing (void).

    Inside the function, use a loop to check the vector. If any sensor reading is negative (less than 0) or greater than 100, use .erase() to remove it from the vector.

    In main(), initialize a vector with these values: {25, -5, 62, 105, 44}.

    Pass it to your function, and then print the vector out in main() to prove the bad readings (-5 and 105) were successfully deleted.*/

void filterSanitize(std::vector<int> &readings){
    
    for (int i = readings.size() - 1; i >= 0; i--) {
        if (readings[i] < 0 || readings[i] > 100) {
            readings.erase(readings.begin() + i); 
    }
}
};

int main() {

    std::vector<int> readings = {25, -5, 62, 105, 44};
    
    filterSanitize(readings);

    for (int i =0; i < readings.size(); i++){
        std::cout << readings[i] << " ";
    }

}