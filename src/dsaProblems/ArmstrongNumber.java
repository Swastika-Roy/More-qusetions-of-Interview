package dsaProblems;

public class ArmstrongNumber {
    public static boolean armstrong(int num){
        int sum = 0;
        int d = num;
        while(num > 0){
            int r = num%10;
            sum = sum + r*r*r;
            num /= 10;
        }
        if(sum == d) return true;
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(armstrong(153));
    }
}
