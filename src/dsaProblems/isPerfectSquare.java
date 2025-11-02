package dsaProblems;

public class isPerfectSquare {
    static void main() {
        int x=16;
        System.out.println(validPerfect(x));
    }

    static boolean validPerfect(int x){
        long st=0, end = x;
        while (st <= end){
            long mid=st+(end-st)/2;
            if(mid*mid == x)return true;
            else if(mid*mid < x)st = mid+1;
            else end=mid-1;
        }
        return false;
    }
}
