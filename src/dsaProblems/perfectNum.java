package dsaProblems;

public class perfectNum {
    static boolean perfect(int n){
        int sum = 0;
        for (int i=1; i <= n/2; i++){
            if(n%i==0) sum += i;
        }
        if(n == sum)return true;
        else return false;
    }

    static void main() {
        System.out.println(perfect(7));
    }
}
