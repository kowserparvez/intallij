package array;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

public class HashNIterator {
    public static void main(String[] args) {

        Map<String, String> myMap = new HashMap<>();
        myMap.put("Apple butter", "1 Tbsp");
        myMap.put("Apple(s) fresh", "1 Medium");
        myMap.put("Applesauce", "1/2 cup");
        myMap.put("Apple(s) fresh", "1/4cup");

        Set one = myMap.entrySet();
        Iterator it = one.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}