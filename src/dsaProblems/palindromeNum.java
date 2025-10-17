package dsaProblems;

public class palindromeNum {
    static boolean palindrome(int num){
        int sum = 0;
        int temp = num;
        while(num != 0){
           int r = num%10;
           sum = sum*10 + r;
           num /= 10;
        }
        if(temp == sum) return true;
        else return false;
    }

    static void main() {
        System.out.println(palindrome(131));
    }
}

//char ch[] = str.toCharArray();
//int st = 0;
//int end = ch.length-1;
//        while (st < end) {
//char temp = ch[st];
//ch[st] = ch[end];
//ch[end] = temp;
//st++;
//end--;
//        }
//        return String.valueOf(str);
