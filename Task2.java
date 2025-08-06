import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = num;

        int min = 10;
        int max = 1000000;

        long[] arr = new long[0];

        while (result > 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = result % 10;
            }

            result /= 10;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
