package DataStructure;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {
    public static void main(String[] args) {
        //declearing arrayList
        List<Integer> numbers = new ArrayList<Integer>(12);
        //storing data into arrayList
        numbers.add(90);
        numbers.add(80);

        //declear iterator .. it is an interface
        Iterator it = numbers.iterator();
        //Retrive date from arraylist
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
