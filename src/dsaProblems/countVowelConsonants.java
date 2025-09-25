package dsaProblems;

public class countVowelConsonants {
    static boolean isVowel(char ch){
        if(ch >= 'a' && ch <='z'){
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' ||
                    ch == 'I' || ch == 'O' || ch == 'U' ) return true;
            else return false;
        }
        return false;
    }

    static void counter(String s) {
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(isVowel(ch)) vowel++;
            else consonant++;
        }
        System.out.println("vowels = "+vowel+" consonant= "+consonant);

    }

    static void main() {
        counter("rajkamal");
    }
}
