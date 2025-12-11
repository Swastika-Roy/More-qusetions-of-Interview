package dsaProblems;

public class StringReverse {
    public static void main(String[] args) {
       String s = "papa";
       StringBuilder sb = new StringBuilder(s).reverse();
        System.out.println(sb.toString());
    }
}
