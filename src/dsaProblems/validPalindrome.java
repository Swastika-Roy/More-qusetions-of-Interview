package dsaProblems;

public class validPalindrome {
    static void main() {
        System.out.println(valid("appa"));
    }
    static boolean valid(String s){
        int l=0; int r=s.length()-1;
        while (l <= r){
            while (l < r && !Character.isLetterOrDigit(s.charAt(l)))l++;
            while (l < r && !Character.isLetterOrDigit(s.charAt(r)))r--;
            char cl = Character.toLowerCase(s.charAt(l));
            char cr = Character.toLowerCase(s.charAt(r));
            if (cl!=cr)return false;
            l++;
            r--;
        }
        return true;
    }
}
