package dsaProblems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeduplicate {
    static void main() {
        int arr[] = {1,1,2,2,3,4,5};
        int num[] = remove(arr);
        for (int i=0; i < num.length;i++){
            System.out.print(num[i]+" ");
        }
    }
    static int[] remove(int arr[]){
        Set<Integer> s = new HashSet<>();
        for (int i=0; i < arr.length; i++){
            s.add(arr[i]);
        }
        int newarr[] = new int[s.size()];
        int i=0;
        for (int num : s){
            newarr[i++] = num;
        }
        return newarr;
    }





}
