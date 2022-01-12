package activities;
import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(0,"Red");
        hashMap.put(1,"Blue");
        hashMap.put(2,"Pink");
        hashMap.put(3,"Green");
        hashMap.put(4,"Yellow");
        System.out.println("map: " + hashMap);
        hashMap.remove(1);
        if(hashMap.containsValue("Pink"))
            System.out.println("Contains");
        else
            System.out.println("Not Contains");
        System.out.println("mapsize: " + hashMap.size());
    }
}
