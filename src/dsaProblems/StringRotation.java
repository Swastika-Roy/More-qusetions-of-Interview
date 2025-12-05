package dsaProblems;

public class StringRotation {

    static boolean rotate(String s1,String s2){
       if(s1.length() != s2.length())return false;
       String s3 = s1+s2;
       if (s3.contains(s2)) return true;
       else return false;
    }

    static void main() {
        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(rotate(s1,s2));
    }
}
