package array;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(0,"Boom boom room");
        myMap.put(1, "Rays Boom boom Room");
        myMap.put(6,"Boom boom boom room");
        myMap.put(3, "doctors Rays Boom boom Room");


        System.out.println(myMap.get(6));

    }

}
