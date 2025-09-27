package dsaProblems;

import java.util.HashMap;

public class CountOfOccurencesinString {
    static void main() {
        countOccurences("Test Automation Java Automation");
    }

    static void countOccurences(String text){
        HashMap<String,Integer> map = new HashMap<>();

        String word[] = text.split(" ");

        for (String c : word){
            if(map.containsKey(c)) map.put(c,map.get(c)+1);
            else map.put(c,1);
        }

        for (String c : map.keySet()){
            System.out.println(c + " appears " + map.get(c) + " times.");
        }
    }
}
