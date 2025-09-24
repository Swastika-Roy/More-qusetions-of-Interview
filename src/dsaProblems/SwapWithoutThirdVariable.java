package dsaProblems;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two nums :  ");
        int num[] = new int[2];
         num[0]  = sc.nextInt();
         num[1] = sc.nextInt();
        System.out.println("Before swapping : ");
        System.out.println(num[0]);
        System.out.println(num[1]);
        swap(num);
        System.out.println("After swapping : ");
        System.out.println(num[0]);
        System.out.println(num[1]);
    }
    static void swap(int[] arr){

       arr[0] = arr[0]+arr[1];
       arr[1] = arr[0]-arr[1];
       arr[0] = arr[0] - arr[1];

    }
}
