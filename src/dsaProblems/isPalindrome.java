package dsaProblems;

public class isPalindrome {
    static boolean isPalindrome(String s){
        int l = 0; int r = s.length()-1;
        while(l < r){
            while(l < r && !Character.isLetterOrDigit(s.charAt(l)))l++;
            while(l < r && !Character.isLetterOrDigit(s.charAt(r)))r--;
            char cl = Character.toLowerCase(s.charAt(l));
            char cr = Character.toLowerCase(s.charAt(r));
            if(cl != cr)return false;
            l++;
            r--;
        }
        return true;
    }
    static boolean pal(String s){
        int l=0; int r = s.length()-1;
        while(l < r){
           while(l < r && !Character.isLetterOrDigit(s.charAt(l)))l++;
           while(l < r && !Character.isLetterOrDigit(s.charAt(r)))r--;
           char cl = Character.toLowerCase(s.charAt(l));
           char cr = Character.toLowerCase(s.charAt(r));
           if(cl != cr)return false;
           l++;
           r--;
        }
        return true;
    }

    static void main() {
       String s = "a ? : ! ? m m a";
        System.out.println(isPalindrome(s));
        System.out.println(pal(s));
    }
}
