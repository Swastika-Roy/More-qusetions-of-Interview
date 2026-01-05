package dsaProblems;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

   static void remove(int arr[]){
       Set<Integer> s = new HashSet<>();
       for(int i : arr){
           s.add(i);
       }
       System.out.println(Arrays.toString(s.toArray()));
   }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,4,5,6};
        remove(arr);
    }
}
