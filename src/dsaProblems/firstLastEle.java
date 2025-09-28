package dsaProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class firstLastEle {
    static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("lichi");
        l.add("apple");
        l.add("mango");
        if(!l.isEmpty()) {
            String first = l.get(0);
            String lst = l.get(l.size()-1);
            System.out.println("first ele = "+first);
            System.out.println("last ele = "+lst);
        }else {
            System.out.println("it is empty");
        }

    }
}
