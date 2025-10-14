package dsaProblems;

import java.util.Scanner;

public class palindromicString {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string : ");
        String s = sc.nextLine();
        System.out.println(palindrome(s));
    }
    static String palindrome(String s){
        char[] ch = s.toCharArray();
        int st = 0; int end = ch.length-1;
        while(st < end){
            char temp = ch[st];
            ch[st] = ch[end];
            ch[end] = temp;
            st++;
            end--;
        }
        return String.valueOf(ch);
    }
}
