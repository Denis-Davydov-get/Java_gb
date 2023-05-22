package homework.leasson_1;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        while(true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Num_1: ");
            int number_1 = sc.nextInt();
            System.out.print("Num_2: ");
            int number_2 = sc.nextInt();
            System.out.print("Какое действие сделать? 1 - сложить, 2- умножить: ");
            int action = sc.nextInt();
         {
            if (action == 1) {
                System.out.println(number_1 + number_2);
            } else if (action == 2) {
                System.out.println(number_1 * number_2);
            } else {
                System.out.println("Вы ввели что-то не то");
            }
        }
        }
    }
}