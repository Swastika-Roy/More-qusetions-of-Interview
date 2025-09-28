package dsaProblems;

import java.util.HashSet;
import java.util.Set;

public class FindCommonElements {
    static void main() {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,9,5};
        common(arr1,arr2);

    }
   static void common(int arr1[], int arr2[]){
       Set<Integer> s1 = new HashSet<>();
       Set<Integer> s2 = new HashSet<>();

       for (int i=0; i < arr1.length; i++) s1.add(arr1[i]);
       for (int i=0; i < arr2.length; i++) {
           if (s1.contains(arr2[i])){
               s2.add(arr2[i]);
           }
       }
       System.out.println(s2);
    }
}
