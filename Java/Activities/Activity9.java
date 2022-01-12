package activities;
import java.util.List;
import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<String>();
        myList.add("name1");
        myList.add("name2");
        myList.add("name3");
        myList.add("name4");
        myList.add("name5");

        for(String s: myList ){
            System.out.println(s);
        }
        System.out.println("3rd name is:"+myList.get(2));
        if(myList.contains("name1"))
            System.out.println("Yes contains");
            else
            System.out.println("No contains");
        System.out.println("Total number of names:"+myList.size());
        myList.remove("name5");
        System.out.println("Total number of names after removing:"+myList.size());
    }
}
