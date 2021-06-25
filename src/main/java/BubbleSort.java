import java.util.Arrays;

import static java.util.Arrays.stream;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 3, 1, 2, 8, 4 ,6};
        bubbleSort(arr);
    }

   static void bubbleSort(int[] arr){
       for(int i=0; i<arr.length; i++){
           for(int j=0; j<arr.length -i -1; j++){
               if(arr[j] >arr[j+1]){
                   int temp = arr[j+1];
                   arr[j+1] = arr[j];
                   arr[j] = temp;
               }
           }
       }
       stream(arr).forEach(System.out::print);
    }
}
