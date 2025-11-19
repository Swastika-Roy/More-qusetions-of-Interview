package dsaProblems;

public class largestSmallest {
    static int largest(int arr[]){
       int lar = arr[0];
       for (int num : arr){
           if(num > lar)lar = num;
       }
       return lar;
    }
    static int smallest(int arr[]){
        int small = arr[0];
        for (int num:arr){
            if(num < small)small = num;
        }
        return small;
    }

    static void main() {
        int arr[] = {1,2,3,4,5};
       int lar = largest(arr);
       int small = smallest(arr);
        System.out.println("largest = "+lar+" smallest = "+small);
    }
}
