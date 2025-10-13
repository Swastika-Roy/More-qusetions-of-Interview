package dsaProblems;

public class StringRotationOfEachOther {
    static void main() {
        System.out.println(check("abcd","cdab"));
    }
    static boolean check(String s1,String s2){
        if(s1.length() != s2.length()) return false;

            String s3 = s1+s2;
            return (s3.contains(s2)) ;
    }
}
