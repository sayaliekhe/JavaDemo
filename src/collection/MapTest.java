package collection;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String args[]) {
        Map<String, Integer> fruits = new HashMap<>();
        fruits.put("Apple",20);
        fruits.put("Banana",10);
        fruits.put("Apple",10);
        System.out.println(fruits);

    }
}
