package dsaProblems;

public class isPrime {
    static void isPrime(int n) {
        int count = 0;
        for(int i=2; i < n; i++){
            if(n%i==0) count++;
        }
        if (count == 2) System.out.println("Prime");
        else System.out.println("Composite");
    }

    public static void main(String[] args) {
        isPrime(50);
    }
}





