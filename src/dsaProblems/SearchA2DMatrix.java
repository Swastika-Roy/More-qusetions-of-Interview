package dsaProblems;

public class SearchA2DMatrix {

    static boolean search(int arr[][],int x){
     int st=0; int end = arr[0].length-1;
     int i=st; int j=end;
     while(i < arr.length  && j >=0){
         if(arr[i][j] == x)return true;
         else if(arr[i][j] < x)i++;
         else j--;
     }
     return false;
    }

    static void main() {
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}};
        int x=3;
        System.out.println(search(arr,x));
    }
}
