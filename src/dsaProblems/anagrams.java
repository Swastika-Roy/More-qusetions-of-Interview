package dsaProblems;

import java.util.Arrays;

public class anagrams {
    static void main() {
        System.out.println(anagrams("papa","apap"));
    }
    static boolean anagrams(String s1, String s2) {
       if(s1.length() != s2.length()) return false;

       char[] ch1 =s1.toCharArray();
       char[] ch2 =s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
}
