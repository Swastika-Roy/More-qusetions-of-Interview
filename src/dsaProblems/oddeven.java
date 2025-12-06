package dsaProblems;

import java.util.Scanner;

public class oddeven {
    static void main() {
        OddEven(5);
    }

    static void OddEven(int num){
       if(num % 2==0) System.out.println("even");
       else System.out.println("odd");
    }
}
