package DataStructure;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> list = new LinkedHashMap<>();
        list.put("USA","NY");
        list.put("UK","LONDON");
        list.put("CANADA","TORANTO");

        for (Map.Entry entry:list.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());

        }

    }
}
