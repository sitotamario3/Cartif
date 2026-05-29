#include <iostream>
#include <string>

/*Let's put this into practice by building a control system blueprint for a robot's motor arm joint.

    Create a class called RobotMotor.

    Inside the class, add a public: access specifier.

    Add three attributes (variables):

        std::string motorName;

        int currentAngle; (in degrees, e.g., 0 to 180)

        bool isEnabled;

    Add a method (function) inside the class called rotateTo. It should take an int newAngle as a parameter. Inside the method, set currentAngle = newAngle; and print out: "[motorName] rotated to [currentAngle] degrees."

    In main():

        Create a RobotMotor object named armMotor.

        Set its name to "Left Arm", its angle to 0, and its status to true.

        Call the rotateTo method on your armMotor object, passing it 90 as the target angle.

Fire up your compiler, stitch your first object together, and paste the code here when you're ready!*/

/*Let's upgrade your RobotMotor class so that it cannot be injected with corrupted angle data.

    Take your working code and change the variables (motorName, currentAngle, isEnabled) from public: to private:.

    Keep the rotateTo(int newAngle) method public:.

    Add a sanity check: Inside rotateTo, wrap your assignment logic in an if statement.

        If newAngle is between 0 and 180 (inclusive), update currentAngle and print the success statement.

        If the angle is out of bounds (like -50 or 300), do not update currentAngle, and print an error message: "ERROR: Angle out of physical bounds!".

    In main(), try to call armMotor.rotateTo(250); to test your defensive validation firewall.

Give this defensive upgrade a shot and paste your hardened class layout below!*/


class RobotMotor{

    private:
        std::string motorName;
            int currentAngle;
            bool isEnabled;

    public:

            void setMotorName(std::string motorName){
                this->motorName = motorName;
            };
    
            std::string getMotorName(){
                return motorName;
            };

            void setIsEnabled(bool enabled){
                isEnabled = enabled; 
            };
    
            bool getIsEnabled(){
                return isEnabled;
            };
            

            void rotateTo(int newAngle){
                if (newAngle <= 180 && newAngle >=0){
                    currentAngle = newAngle;
                    std::cout << motorName << " rotated to " << currentAngle << " degrees."<<std::endl;
                } else {
                    std::cout << "ERROR: Angle out of physical bounds!" <<std::endl;
                }
                
            }

};


int main(){
    RobotMotor armMotor;

    armMotor.setMotorName("Left Arm"); //None of these work, i should put these variables in public or protected, not private, i try implementing setters and getters.
    armMotor.setIsEnabled(true);

    armMotor.rotateTo(90);    
};