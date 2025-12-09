package dsaProblems;

public class SumOfDigits {
    static int sum(int num){
    int sum = 0;
    while(num != 0){
        int r = num %10;
        sum += r;
        num /= 10;
    }
    return sum;
    }
    static void main() {
        System.out.println(sum(123));
    }
}
