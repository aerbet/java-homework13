import java.util.Scanner;

public class Task4 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите высоту башни от 0 до 12: ");
        int height = sc.nextInt();
        System.out.print("Введите высоту на которой стоит человек от 0 до 12: ");
        int human = sc.nextInt();

        for (int i = 0; i < height; i++) {
            int count = i + 2;
            int spaces = height - i - 1;

            String step;

            if (i == height - human - 1) {
                step = "@" + "#".repeat(count - 1);
            } else {
                step = "#".repeat(count);
            }

            String line = " ".repeat(spaces) + step;

            System.out.println("| " + line);
        }

        System.out.println("-".repeat(height + 3));

        sc.close();
    }
}
