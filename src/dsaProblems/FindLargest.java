package dsaProblems;

public class FindLargest {
    public static void largest(int[] arr){
       int l = arr[0];
       for(int num : arr){
           if(num > l){
               l=num;
           }
       }
        System.out.println(l);
       return;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        largest(arr);
    }

//    int i = m - 1;      // last index of arr1's initial elements
//    int j = n - 1;      // last index of arr2
//    int k = m + n - 1;  // last index of merged array
//
//    // Merge from the end into arr1
//        while (j >= 0) {
//        if (i >= 0 && arr1[i] > arr2[j]) {
//            arr1[k--] = arr1[i--];
//        } else {
//            arr1[k--] = arr2[j--];
//        }
//    }
}
