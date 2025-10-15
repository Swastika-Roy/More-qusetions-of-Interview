package dsaProblems;

public class peakElement {
    static void main() {
      int arr[] = {1,2,3,0,0};
        System.out.println(peakEle(arr));
    }
    static int peakEle(int arr[]){
        int n = arr.length;
        if(n == 1) return 0;
         if(arr[0] > arr[1]) return 0;
         if(arr[n-1] > arr[n-2]) return n-1;

            int l = 1; int r = n-2;
            while(l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) return mid;
                else if (arr[mid] < arr[mid + 1]) l = mid + 1;
                else r = mid - 1;
            }

        return -1;
    }
}
