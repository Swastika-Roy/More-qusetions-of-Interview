package dsaProblems;

public class ReverseVowels {

    static String ReverseVowels(String s){
        char arr[] = s.toCharArray();
        int st=0; int end=s.length()-1;
        while (st < end){
            if(!isVowel(arr[st]))st++;
            else if (!isVowel(arr[end]))end--;
            else {
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return String.valueOf(arr);
    }

    static boolean isVowel(char ch){
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch=='o' || ch =='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') return true;
        else return false;
    }

    static void main() {
        String s = "Icecream";
        System.out.println(ReverseVowels(s));
    }
}
