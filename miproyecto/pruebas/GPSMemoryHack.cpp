#include <iostream>

/*Let's simulate a navigation system where a background system updates your coordinates via pointers.

    In main(), create a double variable called latitude = 40.7128;.

    Create a double pointer called gpsPtr and assign it the memory address of latitude.

    Print the value of gpsPtr (this should show the hex memory address).

    Print the dereferenced value of gpsPtr (this should show 40.7128).

    Use the pointer to change the latitude value to 34.0522.

    Print the original latitude variable to prove it changed successfully via the pointer.

Type this up in your editor, see how the hex addresses look on your machine, and paste the code here when you're ready!*/

int main(){

    double latitude = 40.7128;
    double* gpsPtr = &latitude;

    std::cout << gpsPtr <<std::endl;
    std::cout << *gpsPtr <<std::endl;

    *gpsPtr = 34.0522;

    std::cout << latitude << std::endl;

}