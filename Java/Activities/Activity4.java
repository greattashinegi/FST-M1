package activities;
import java.util.Arrays;

public class Activity4 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 8, 5, 2, 16, 9};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;

            }
            arr[j + 1] = key;
                //if (arr[i] > arr[j])
                //arr[i] = arr[j];
            }
        System.out.println(Arrays.toString(arr));
        }

    }



