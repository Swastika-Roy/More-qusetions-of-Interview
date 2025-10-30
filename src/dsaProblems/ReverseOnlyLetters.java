package dsaProblems;

public class ReverseOnlyLetters {

    static String ReverseOnly(String s){
        char arr[] = s.toCharArray();
        int st = 0; int end=s.length()-1;
        while(st < end){
            if(!Character.isLetter(arr[st]))st++;
            else if(!Character.isLetter(arr[end]))end--;
            else{
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return String.valueOf(arr);
    }

    static void main() {
        String s = "ab-cd";
        System.out.println(ReverseOnly(s));
    }

}
