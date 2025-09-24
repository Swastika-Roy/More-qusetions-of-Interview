package dsaProblems;

import java.util.Scanner;

public class oddeven {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();
        boolean ans = OddEven(num);
        if(ans == true){
            System.out.println("even");
        }else System.out.println("odd");
    }

    static boolean OddEven(int num){
        return num % 2 == 0;
    }
}
