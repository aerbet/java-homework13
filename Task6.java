import java.util.Scanner;

public class Task6 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите цену товара в копейках до 1000: ");
        int sum = sc.nextInt();

        int rub = sum / 100;
        int kop = sum % 100;
        
        String rubWord, kopWord;

        if (sum > 1000 || sum < 0) {
            System.out.println("Вы ввели цену вне указанного диапозона");
        } else {
            if (rub % 100 >= 11 && rub % 100 <= 14) {
                rubWord = "рублей";
            } else if (rub % 10 == 1) {
                rubWord = "рубль";
            } else if (rub % 10 >= 2 && rub % 10 <= 4) {
                rubWord = "рубля";
            } else {
                rubWord = "рублей";
            }
    
            if (kop % 100 >= 11 && kop % 100 <= 14) {
                kopWord = "копеек";
            } else if (kop % 10 == 1) {
                kopWord = "копейка";
            } else if (kop % 10 >= 2 && kop % 10 <= 4) {
                kopWord = "копейки";
            } else {
                kopWord = "копеек";
            }
    
            System.out.printf("%d %s %d %s\n", rub, rubWord, kop, kopWord);
        }
        
        sc.close();
    }
}
