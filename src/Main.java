import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Reversing an Array work

        int [] myArray = {1,2,3,4,5,6,7,8,9};

        System.out.println("My current array: " + Arrays.toString(myArray));

        //using a for loop to run through myArray one item at a time
        for(int i = 0; i < myArray.length / 2; i++ ){
            //here we initialize j to be equal to myArray[i] which would be at index 0 on myArray at the time
            int j = myArray[i];
            //now we declare myArray[i] to be equal to myArray's length - i - 1. we want myArray[i] to be equal to the .length so
            //the first index of myArray is now equal to the last index, this swaps the numbers
            myArray[i] = myArray[myArray.length - i - 1];
            //here we update the value at the other end of the array to ensure a successful swap
            myArray[myArray.length - i - 1] = j;
        }

        System.out.println("Array after being reversed: " + Arrays.toString(myArray));
    }
}