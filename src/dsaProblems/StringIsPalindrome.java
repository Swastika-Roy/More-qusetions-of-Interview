package dsaProblems;

public class StringIsPalindrome {
    static void main() {
        System.out.println(palindrome("madam"));
    }

    static boolean palindrome(String str){
       int st=0;int end =str.length()-1;
       while (st <= end){
           if(str.charAt(st) != str.charAt(end))return false;
           st++;
           end--;
       }
       return true;
    }
}

//boolean inWord = false; // inside the word
//int count =0;
//        for(int i=0; i < text.length(); i++){
//char c = text.charAt(i);
//             if(Character.isWhitespace(c)) inWord = false; // if it is whitespace then it is outside of word
//        else{
//        if(!inWord){
//count++; // we just started a new word
//inWord = true;
//        }
//        }
//        }
//        return count;
