package miproyecto.pruebasjava;

class TwoSum {
    

    public static void main(String[] args) {
        // Declare variables
        int[] arr = {2,7, 11, 15};
        int x = 9;
        boolean found = false;

        for (int i = 0; i < arr.length; i++ ){
            for (int j =1; j <arr.length; j++){
                if (arr[i] + arr[j] == x){
                    System.out.println("["+ i + "," + j + "]");
                    found = true;
                } 
            }
            if (found){
                break;
            }

        }
    }
}