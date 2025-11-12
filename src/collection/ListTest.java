package collection;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String args[]) {
        List<Integer> number = new ArrayList<>();
        number.add(34);
        number.add(55);
        number.add(2,67);
        System.out.println(number);
    }
}
