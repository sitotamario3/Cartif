#include <iostream>

/*Let's test this memory mechanism out by simulating a robot's battery dropping as it drives around.

    Write a function named drainBattery.

    It should take an int &batteryLevel as a parameter (passed by reference).

    It should return nothing (void).

    Inside the function, subtract 20 from batteryLevel.

    Inside main(), create an integer int mainBattery = 100;.

    Call your function passing mainBattery, then print mainBattery right after.

If you did it correctly, your output in the terminal should show 80, proving you successfully modified the original memory slot! Give it a shot in your editor and paste it here when you're done.*/

void drainBattery(int &batteryLevel){
    batteryLevel -= 20;

}

int main(){
    int mainBattery = 100;

    drainBattery(mainBattery);

    std::cout << "Remaining battery: " << mainBattery <<std::endl;

    return 0;
}