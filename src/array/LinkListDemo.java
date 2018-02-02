package array;

import java.util.LinkedList;

public class LinkListDemo {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();
        myList.add("home");
        myList.add("away");
        myList.add("road");
        for(String a : myList ){
            System.out.println(a);
        }

    }
}
