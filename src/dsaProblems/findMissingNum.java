package dsaProblems;

public class findMissingNum {
    static void main() {
      int arr[] = {1,2,3,5};
        System.out.println(missing(arr));
    }
    static int missing(int arr[]){
        int n = arr.length+1;
        int total = n*(n+1)/2;
        int arrsum = 0;
        for(int num : arr) arrsum += num;
        return total-arrsum;
    }
}
