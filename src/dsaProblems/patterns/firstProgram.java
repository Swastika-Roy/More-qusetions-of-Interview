package dsaProblems.patterns;

public class firstProgram {
    static void main() {
      pattern5(5);
    }

    static void pattern1(int n){
        for (int i=1; i <= n; i++){
            //for every row run the col
            for (int j=1; j <= i; j++){
                System.out.print("*");
            }
            //when one row printed, add new line
            System.out.println();
        }
    }

    static void pattern2(int n){
        for (int i=1; i <= n; i++){
            //for every row run the col
            for (int j=1; j <= n; j++){
                System.out.print("*");
            }
            //when one row printed, add new line
            System.out.println();
        }
    }


    static void pattern3(int n){
        for (int i=n; i >= 1; i--){
            //for every row run the col
            for (int j=1; j <= i; j++){
                System.out.print("* ");
            }
            //when one row printed, add new line
            System.out.println();
        }
    }

    static void pattern4(int n){
        for (int i=1; i <= n; i++){
            //for every row run the col
            for (int j=1; j <= i; j++){
                System.out.print(j);
            }
            //when one row printed, add new line
            System.out.println();
        }
    }


}
