package dsaProblems;

public class ReverseEachWordInAString {
    public static String Reverse(String str){
      String[] words = str.split(" +");
      StringBuilder sb = new StringBuilder();
      for (int i=words.length-1; i>=0; i--){
          sb.append(words[i]);
          sb.append(' ');
      }
      return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "Java is a good programming langauage";
        System.out.println(Reverse(s));
    }
}
