#include <iostream>

std::string checkSafety(int distance){
        if (distance < 10){
            return "STOP";
        } 
            return "GO";
        
    }

int main(){
    /*Let's modify the code above or write a new one. I want you to create a function called checkSafety.

    It should take an int distance as a parameter.

    It should return a string (std::string).

    Inside the function, write an if/else block:

        If the distance is less than 10, return the string "STOP".

        Otherwise, return the string "GO".

    Call this function inside main(), pass it a test distance (like 8), and print the result it hands back to you. Give it a shot!*/

    std::string result = checkSafety(8);

    std::cout << "Distance result: " << result << std::endl;




}