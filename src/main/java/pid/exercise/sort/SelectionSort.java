package pid.exercise.sort;

public class SelectionSort {

    public static void sort(int[] array) {

        //outer loop that takes each element and compare it to the other elements inside the inner loop
        for (int i = 0; i < array.length - 1; i++) {
            //assuming that the element at index i is the minimum element to pass it to the inner loop
            int min = i;
            //inner loop where element at index i is compared to the rest of the elements
            for (int j = i + 1; j < array.length; j++) {
                //if statement to check if element at index j < element at index i
                if (array[j] < array[min]) {
                    //if true the new min will be element at index j
                    min = j;
                }
                //the inner loop will keep comparing element at index min until its over
            }
            //temp is to hold the element at index i while value of the index being changed to the element at index min
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }

    }

}