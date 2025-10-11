package dsaProblems.patterns;

public class firstProgram {
    static void main() {
      pattern9(5);
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

    static void pattern5(int n){
        for (int i=0;i < 2*n;i++){
            int totalCol = i > n ? 2 * n - i : i;
            for (int j =0; j < totalCol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for (int i=0;i < 2*n;i++){
            int totalCol = i > n ? 2 * n - i : i;
            int noOfspaces = n-totalCol;
            for(int s=0; s < noOfspaces; s++){
                System.out.print(" ");
            }
            for (int j =0; j < totalCol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n){
        for (int row = 1; row <=  n; row++){
            for (int space=0; space< n-row;space++){
                System.out.print("  ");
            }
            for(int col = row; col >= 1; col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern8(int n){
        for (int row = 1; row <= 2* n; row++){
            int c = row > n ? 2 * n - row: row;
            for (int space=0; space< n-c;space++){
                System.out.print("  ");
            }
            for(int col = c; col >= 1; col--){
                System.out.print(col+" ");
            }
            for (int col=2;col<=c;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void pattern9(int n){
        int oldn =n;
         n= 2*n;
       for (int i=0; i <= n;i++){
           for (int j=0; j <= n; j++){
               int ateveryindex=oldn-Math.min(Math.min(i,j),Math.min(n-i,n-j));
               System.out.print(ateveryindex+" ");
           }
           System.out.println();
       }
    }


}
