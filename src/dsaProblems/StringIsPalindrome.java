package dsaProblems;

public class StringIsPalindrome {
    static void main() {
        System.out.println(palindrome("madam"));
    }

    static boolean palindrome(String str){
        int st = 0;
        int end = str.length()-1;
        while(st <= end){
            if(str.charAt(st) != str.charAt(end)) return false;
            st++;
            end--;
        }
        return true;
    }
}
