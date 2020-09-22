package Genericss;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Genne {

    public static void main(String[] args) {


        List mylist = new LinkedList();

        mylist.add(new Integer(0));
        Integer x = (Integer) mylist.iterator().next();


        List<Integer> mylistGen = new LinkedList<>();
        Integer y = mylistGen.iterator().next();

        List<String> stringList = new ArrayList<>();

        String s = stringList.get(0);
    }
}
