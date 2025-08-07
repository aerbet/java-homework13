import java.util.Scanner;

public class Task5 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите координаты x и y через пробел: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x == 0 || y == 3) {
            System.out.println("Координаты находятся на границе");
        } else if (y > 3) {
            System.out.println("I область");
        } else if (y < 3) {
            System.out.println("II область");
        }

        sc.close();
    }
}
