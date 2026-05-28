#include <iostream>
#include <vector>

/*Your Task:

    Write a function called isBruteForce.

        It should take a std::vector<std::string> logHistory by value.

        It should return a boolean (bool)—true if an attack is detected, false if the system is clean.

    Inside the function:

        Create a counter variable.

        Use a loop to scan through the vector. Every time you find the string "FAILED", increment your counter.

        If "FAILED" appears 3 or more times, return true. Otherwise, return false.

    In main():

        Create a vector of strings representing recent login logs: {"SUCCESS", "FAILED", "SUCCESS", "FAILED", "FAILED"}.

        Call your isBruteForce function, passing it your logs.

        Use an if/else statement to check what the function returned. If it's true, print "ALERT: Brute force detected!". Otherwise, print "System Secure".*/

bool isBruteForce(std::vector<std::string> logHistory){
    int counter = 0;

    for (int i = 0; i < logHistory.size(); i++ ){
        if (logHistory[i] == "FAILED"){
            counter++;
        }
    }

    if (counter >= 3){
        return true;
    } else {
        return false;
    }
}

int main(){

    std::vector<std::string> logHistory = {"SUCCESS", "FAILED", "SUCCESS", "FAILED", "FAILED"};

    if (isBruteForce(logHistory)){
        std::cout << "ALERT: Brute force detected!";
    } else {
        std::cout << "System Secure";
    }

    return 0;
    
}