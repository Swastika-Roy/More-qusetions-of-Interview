package dsaProblems;

import java.util.ArrayList;
import java.util.List;

public class common_characters {

    public List<String> duplicate(String[] words) {
         ArrayList<String> res = new ArrayList<>();
         for(char c = 'a' ; c <= 'z' ; c++) {
             int min = Integer.MAX_VALUE;
             for (String word : words) {
                 int count = 0;
                 for (char ch : word.toCharArray()) {
                     if (ch == c) count++;
                 }
                 min = Math.min(min, count);
                 if(min == 0) break;
             }
             for (int i = 0; i < min; i++) {
                 res.add(String.valueOf(c));
             }
         }
             return res;
    }

    public static void main(String[] args) {
        common_characters obj = new common_characters();
        String[] words = {"bella", "label", "roller"}; // Example input

        List<String> result = obj.duplicate(words);
        System.out.println("Common characters: " + result);
    }
//    int st = 0; int end = arr[0].length -1;
//    int i=st; int j=end;
//      while(i < arr.length && j >= 0){
//        if(arr[i][j] == x)return  true;
//        else if(arr[i][j] < x)i++;
//        else j--;
//    }
//      return false;
}
















