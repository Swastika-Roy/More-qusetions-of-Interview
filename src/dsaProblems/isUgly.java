package dsaProblems;

public class isUgly {
    static boolean ugly(int n){
        if(n <= 0)return false;
        while(n!=1){
            if(n%2==0)n/=2;
            else if(n%3==0)n/=2;
            else if(n%5==0)n/=5;
            else break;
        }
        if(n==1)return true;
        else return false;
    }

    static void main() {
        System.out.println(ugly(28));
        System.out.println(ugly(12));
    }
}
