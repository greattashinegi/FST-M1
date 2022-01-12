package activities;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<String>();
        hashSet.add("obj1");
        hashSet.add("obj2");
        hashSet.add("obj3");
        hashSet.add("obj4");
        hashSet.add("obj5");
        hashSet.add("obj6");
        System.out.println("Total number of objects in hashset:"+hashSet.size());
        hashSet.remove("obj1");
        hashSet.remove("obj10");
        if(hashSet.contains("obj2"))
            System.out.println("yes contains");
        else
            System.out.println("No Contains");
    }
}
