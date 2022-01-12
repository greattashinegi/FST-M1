package activities;

public class Activity2 {
    public static void main(String[] args) {
        int[] arr = {10, 77, 10, 54, -11, 10};
        int total = 0;
        int searchNum = 10;
        int fixedSum = 30;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == searchNum) {
                total = total + 10;
            }
        }
        if (total == fixedSum)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
