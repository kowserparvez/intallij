package DataStructure;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseListMap {
    public static void main(String[] args) {
        List<String> cityOfUsa = new ArrayList<>();
        cityOfUsa.add("NY");
        cityOfUsa.add("PA");
        cityOfUsa.add("TX");
        cityOfUsa.add("CA");


        List<String> cityOfCanada = new ArrayList<>();
        cityOfCanada.add("TO");
        cityOfCanada.add("MO");
        cityOfCanada.add("AL");
        cityOfCanada.add("ON");

        Map<String, List<String>> list = new LinkedHashMap<>();
        list.put("USA",cityOfUsa);
        list.put("CANADA",cityOfCanada);

        for (Map.Entry entry:list.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
    }
}
