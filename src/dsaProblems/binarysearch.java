package dsaProblems;

public class binarysearch {
    static void main() {
       int arr[] = {1,2,3,4};
        System.out.println(binary(arr,4));
    }

    static int binary(int arr[],int target){
        int l=0; int r = arr.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] < target) l = mid+1;
            else r=mid-1;
        }
        return -1;
    }
}
