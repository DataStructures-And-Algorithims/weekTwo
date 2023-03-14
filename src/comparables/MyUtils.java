package comparables;

import java.util.ArrayList;

public class MyUtils {
    public static <Item> void iterateAnyList(ArrayList<Item> anyList) {
        for(Item item : anyList) {
            System.out.println(item);
        }
    }
}