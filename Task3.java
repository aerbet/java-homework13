import java.util.Scanner;

public class Task3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите год от 1984 по наше время: ");
        int currentYear = sc.nextInt();

        if (currentYear > 2025) {
            System.out.println("Вы ввели год в будущем времени, расчёт будет произведен согласно старояпонскому календарю на указанный год: ");
        }

        if (currentYear < 1984) {
            System.out.println("Вы ввели год ниже требуемого");
        }

        int start = currentYear - 1984;
        int colorIndex = ((start % 60) % 10) / 2;
        int animalIndex = start % 60 % 12;

        String[] colors = {"зелено", "красно", "желто", "бело", "черно"};
        String[] animals = {"й крысы", "й коровы", "го тигра", "го зайца", "го дракона", "й змеи", "й лошади", "й овцы", "й обезьяны", "й курицы", "й собаки", "й свиньи"};
        
        System.out.println("Это год: " + colors[colorIndex] + animals[animalIndex]);
        
        sc.close();
    }
}