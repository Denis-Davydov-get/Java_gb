//* +Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
// например, 2? + ?5 = 69. Требуется восстановить выражение до верного равенства.
// Предложить хотя бы одно решение или сообщить, что его нет.
package homework.leasson_1;
import java.util.Scanner;
public class theEquation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        int number_1 = 2;
        int number_2 = 5;
        int result = 69;
        if(number_1 * y + number_2 * x == result){
            System.out.println(number_1 * y + number_2 * x);
            System.out.println("Решение есть.");}
        else{
            System.out.println(number_1 * y + number_2 * x);
            System.out.println("Решения нет.");
            }

    }
}
