package dsaProblems;

import java.util.Arrays;
import java.util.Scanner;

public class binarysearch {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array : ");
        int n=sc.nextInt();
      int arr[] = new int[n];

        System.out.println("Enter elements : ");
      for(int  i=0; i < n; i++){
          arr[i] = sc.nextInt();
      }
        System.out.println("enter target");
      int x = sc.nextInt();
        System.out.println(Arrays.toString(arr));
        System.out.println(binary(arr,x));

    }

    static void print(int arr[]){
        for (int i=0;i < arr.length; i++){
            System.out.print(arr[i]);
        }
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
