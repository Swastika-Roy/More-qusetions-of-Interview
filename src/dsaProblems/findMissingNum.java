package dsaProblems;

public class findMissingNum {
    static void main() {
      int arr[] = {1,2,3,5};
        System.out.println(missing(arr));
    }
    static int missing(int arr[]){
       int n=arr.length+1;
       int total=n*(n+1)/2;
       int arrsum =0;
       for (int i=0; i < arr.length;i++){
           arrsum += arr[i];
       }
       return total-arrsum;
    }
//    int left = 0;
//    int right = arr.length - 1;
//        while (left <= right) {
//        int mid = left + (right - left) / 2;
//        if (arr[mid] == target) return mid;
//        else if (arr[left] < arr[mid]) {
//            if (target >= arr[left] && target < arr[mid]) right = mid - 1;
//            else left = mid + 1;
//        } else {
//            if (target > arr[mid] && target <= arr[right]) left = mid + 1;
//            else right = mid - 1;
//        }
//    }
//        return -1;
}
