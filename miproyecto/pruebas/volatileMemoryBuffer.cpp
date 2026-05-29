#include <iostream>

/*Let's simulate a cybersecurity script that temporarily allocates a buffer to store a decrypted password, processes it, and then securely wipes the memory so it can't be stolen by an exploit tool.

    Inside main(), create an integer variable called bufferSize = 5;.

    Use the new keyword to allocate a dynamic integer array on the heap of size bufferSize. Store the address in a pointer called buffer.

    Use a loop to fill your heap array with the numbers 10, 20, 30, 40, 50.

    Print out the elements using your pointer to prove they are safely in the heap.

    Crucial Step: Deallocate the array using delete[] buffer; (Note: when deleting an array, you use delete[] instead of just delete).

    Ground your pointer by setting buffer = nullptr;.

Give this dynamic heap allocation a shot in your editor, make sure you don't leak any memory, and paste your code here when you're ready!*/

int main(){

    int bufferSize = 5;
    int* pBuffer = new int[bufferSize];

    for (int i=0; i<bufferSize; i++ ){
        pBuffer[i] = (i+1) *10;
        std::cout<<pBuffer[i] << ", ";
    };

    delete[] pBuffer;
    pBuffer = nullptr;

    

    return 0;
}