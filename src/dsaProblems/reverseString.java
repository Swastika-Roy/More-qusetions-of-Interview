package dsaProblems;

import java.util.Scanner;

public class reverseString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String s = sc.nextLine();
        System.out.println(rev(s));
    }

    static String rev(String s){
        char ch ;
        String rs = "";
        for (int i=s.length()-1; i >= 0; i--){
            ch = s.charAt(i);
            rs += ch;
        }
        return rs;
    }
}

//String[] ch = str.split(" ");
//       StringBuilder ans = new StringBuilder();
//
//       for (String word : ch){
//           for (int i = word.length()-1; i >= 0; i--){
//               ans.append(word.charAt(i));
//           }
//           ans.append(" ");
//       }
//        System.out.println(ans.toString().trim());
