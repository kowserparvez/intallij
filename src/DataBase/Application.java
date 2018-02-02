package DataBase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Application {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        LinkedList<String> linkedList= new LinkedList<String>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

      //  list.forEach(System.out::println);

        for(String x : list){
            System.out.println(x);
        }
//        ListIterator<String> listIterator = list.listIterator();
//        while(listIterator.hasNext()){
//            System.out.println(listIterator.next());
//
//        }
//
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//
//        }
    }



}
