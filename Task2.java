import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите число от 10 до 1000000: ");
        int num = sc.nextInt();
        int numLength = 0;
        int numTemp = num;
        int overall = 0;
        double amf = 0;

        int evenIndex = 0, oddIndex = 0;

        int min = 10;
        int max = 1000000;
        
        if (num > max || num < min) {
            System.out.println("Вы ввели число вне указанного диапозона, попробуйте ещё раз.");
        } else {
            while (numTemp > 0) {
                numLength++;
                numTemp /= 10;
            }

            int[] arr = new int[numLength];
            int[] evenNums = new int[numLength];
            int[] oddNums = new int[numLength];

            for (int i = 0; i < numLength; i ++) {
                arr[i] = num % 10;
                num /= 10;

                overall += arr[i];

                if (arr[i] % 2 == 0) {
                    evenNums[evenIndex++] = arr[i];
                } else {
                    oddNums[oddIndex++] = arr[i];
                }
            }

            Arrays.sort(arr);

            amf = ((double) arr[0] + arr[arr.length - 1]) / 2;


            String tmpl = "%s: %s\n";

            System.out.printf(tmpl, "Количество цифр в числе: ", numLength);
            System.out.printf(tmpl, "Сумма всех цифр в числе: ", overall);
            System.out.printf(tmpl, "Четные цифры: ", Arrays.toString(Arrays.copyOf(evenNums, evenIndex)));
            System.out.printf(tmpl, "Нечетные цифры: ", Arrays.toString(Arrays.copyOf(oddNums, oddIndex)));
            System.out.printf(tmpl, "Среднее арифметичсекое минимального и максимального числа: ", amf);

            sc.close();
        }
    }
}
