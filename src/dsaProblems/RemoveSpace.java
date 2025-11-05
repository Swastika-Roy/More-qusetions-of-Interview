package dsaProblems;

public class RemoveSpace {
    static void main() {
       String s = "I am billioner.";
        System.out.println(removeSpace(s));
    }
    static String removeSpace(String s){
        StringBuilder sb = new StringBuilder();
        for ( int i=0; i < s.length(); i++){
            if(s.charAt(i) != ' ') sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
