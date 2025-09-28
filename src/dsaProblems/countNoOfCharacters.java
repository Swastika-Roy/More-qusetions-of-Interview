package dsaProblems;

public class countNoOfCharacters {
    static void main() {
        System.out.println(count("I am Swastika Roy."));
    }

    static int count(String text){
        boolean inWord = false; // inside the word
        int count =0;
        for(int i=0; i < text.length(); i++){
             char c = text.charAt(i);
             if(Character.isWhitespace(c)) inWord = false; // if it is whitespace then it is outside of word
            else{
                if(!inWord){
                    count++; // we just started a new word
                    inWord = true;
                }
             }
        }
        return count;
    }
}
