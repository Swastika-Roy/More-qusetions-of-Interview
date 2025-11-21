package dsaProblems;

public class ReverseNum {

    public static void Rev(int num){
       int temp = num;
       int sum=0;

       while(temp != 0){
           int rem = temp%10;
           sum = sum*10+rem;
           temp /=10;
       }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Rev(123);
    }
}

