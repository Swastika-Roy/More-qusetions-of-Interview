package dsaProblems;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = {-1,-2,4,9,3,5};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void BubbleSort(int[] arr){
        for(int i=0; i < arr.length-1; i++){
            for (int j=0; j < arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
