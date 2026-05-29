#include <iostream>
#include <string>

class AutonomousVehicle {
protected: // "protected" is a secret handshake: it keeps variables private from main(), 
           // but allows child classes to access them directly!
    int batteryLevel = 100;

public:
    void charge() {
        batteryLevel = 100;
        std::cout << "Vehicle battery fully charged." << std::endl;
    }

    virtual void deployMission(){
        std::cout << "Performing generic vehicle deployment." <<std::endl;
    }
};

/*Let's expand this fleet by creating a brand-new child class alongside our Drone.

    Copy the AutonomousVehicle base class code from above.

    Create a new child class named Rover that inherits publicly from AutonomousVehicle.

    Give the Rover class a unique public method called drive.

    Inside drive(), subtract 15 from batteryLevel and print out: "Rover wheels turning. Battery at [batteryLevel]%"

    In main():

        Instantiate a Rover object named groundBot.

        Call groundBot.drive();

        Call groundBot.charge();

Stitch this family tree together in your editor, test it out, and paste the code here when you're ready!*/

class Rover : public AutonomousVehicle {
    public:
        void deployMission() override {
            batteryLevel -=15;
            std::cout << "Rover deployed: Scanning terrain. Battery at " << batteryLevel << "%." <<std::endl;
        }
};


/*Let's refactor your code to use clean, polymorphic method overriding.

    Keep your AutonomousVehicle class, but add a public virtual method called void deployMission(). Inside it, print: "Performing generic vehicle deployment."

    Update your Rover class:

        Remove the drive() method.

        Add a void deployMission() override method. Inside it, subtract 15 from batteryLevel and print out: "Rover deployed: Scanning terrain. Battery at [batteryLevel]%"

    In main():

        Call groundBot.deployMission(); to test your overridden behavior.

Stitch this together, check how the child class overrides the parent placeholder, and paste your code below!*/


int main(){

    Rover groundBot;

    groundBot.deployMission();
    groundBot.charge();

    return 0;
};