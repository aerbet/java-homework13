import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long[] salaryArr = new long[5];
        long res = 0;

        System.out.println("Введите зарплату 5ти сотрудников за месяц:");
        for (int i = 0; i < 5; i++) {
            long salary = sc.nextLong();

            if (salary < 0) {
                System.out.println("Зарплата сотрудника не может быть отрицательной");
            } else {
                salaryArr[i] = salary;
                res += salaryArr[i];
            }
        }

        Arrays.sort(salaryArr);
        long min = salaryArr[0];
        long max = salaryArr[salaryArr.length - 1];
        long del = max - min;

        String tmpl = "%-19s %,d\n";

        System.out.printf(tmpl, "Разница:", del);
        System.out.printf(tmpl, "Минимальный оклад:", min);
        System.out.printf(tmpl, "Максимальный оклад:", max);
        System.out.printf(tmpl, "Общая сумма:", res);

        sc.close();
    }
}
