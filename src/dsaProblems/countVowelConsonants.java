package dsaProblems;

public class countVowelConsonants {
     static void counter(String str){
         int vowel = 0; int consonant = 0;
         for (int i = 0; i < str.length();i++){
             if (isVowel(str.charAt(i))){
                 vowel++;
             }
             else consonant++;
         }
         System.out.println("Vowels= "+vowel+" Consonant = "+consonant);
     }
     static boolean isVowel(char ch){
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'
                || ch == 'A' || ch == 'E' ||ch == 'O' ||ch == 'I' ||ch == 'U' ){
            return true;
        }else return false;
    }
    public static void main(String[] args) {
       counter("Automation");
    }
}
