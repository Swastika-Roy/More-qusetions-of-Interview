package dsaProblems;

public class RemoveVowelsFromString {
    static boolean IsVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' ||ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')return true;
        else return false;
    }

    static String removeVowel(String s){
        StringBuilder str = new StringBuilder();
        for (int i=0;i < s.length();i++){
            if(!IsVowel(s.charAt(i))) str.append(s.charAt(i));
            else continue;
        }
        return str.toString();
    }

    static void main() {
        String s = "Welcome to gfg";
        System.out.println(removeVowel(s));
    }
}
