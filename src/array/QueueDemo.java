package array;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // first in first out
        Queue<String> myQueue =new LinkedList<>();

        myQueue.add("abcd");
        myQueue.add(("mnop"));
        myQueue.add("try again ");
        myQueue.offer("Boy");
        myQueue.offer( "Girl");


        for (String a : myQueue){
            System.out.println(a);

        }





    }
}
