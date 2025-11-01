package dsaProblems;

public class minRotatedSortedArray {
    static void main() {
     int arr[] = {4,5,6,1,2,3};
        System.out.println(minRotated(arr));
    }

    static int minRotated(int arr[]){
        int st=0;
        int end = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while (st <= end){
            int mid=st+(end-st)/2;
            if(arr[st] < arr[mid]) {
                ans = Math.min(ans,arr[st]);
                st=mid+1;
            }
            else {
                ans = Math.min(ans,arr[mid]);
                end = mid-1;
            }
        }
        return ans;
    }
}
