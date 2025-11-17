package dsaProblems;

public class countNoOfCharacters {
    static void main() {
        System.out.println(count("I am Swastika."));
    }

    static int count(String text){
       boolean inword = false;
       int count = 0;
       for(int i=0; i < text.length(); i++){
           char c = text.charAt(i);
           if(Character.isWhitespace(c)) inword = false;
           else{
              if(!inword) {
                  count++;
                  inword=true;
              }
           }
       }
       return count;
    }
}
