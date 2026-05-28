#include <iostream>

int main() {
    int number = 7;
    int guess;
    int limit = 5;
    int tries = 1;

    std::cout << "Try to guess the number" << std::endl;
    std::cin >> guess; // First guess before the loop starts


    while ((number != guess) && (limit != tries)) {
        
        if (limit == tries){
            std::cout << "Sorry, you've run out of tries!";
            return 0;
        } else {
            std::cout << "That's not the number, try again. Guess Number " << tries << std::endl;
            
            std::cin >> guess; 
            tries ++;
        }

    }

    if (limit == tries && guess != number){
            std::cout << "Sorry, you've run out of tries!";
            return 0;
        } else {
            std::cout << "Great you found the number " << number << " in: "<< tries << " tries." << std::endl;
        }

    return 0;
}