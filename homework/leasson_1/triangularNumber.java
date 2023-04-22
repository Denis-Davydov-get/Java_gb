//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
//1, 3, 6, 10, 15, 21, 28, 36, 45, 55, 66, 78, 91, 105... тругольные числа
package Java.homework;
import java.util.Scanner;
public class triangularNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("До какого порядкого числа считать треугольные числа?: ");
        int number = sc.nextInt();
        number++;
        int count = 0;
        int summ = 0;
        int multiplay = 1;
        int [] array = new int[number];
        for (int i = 1; i < array.length; i++){
            count += i;
            summ += count;
            array[i] = count;
            multiplay *= array[i];
            System.out.println(count);

        }
        System.out.println("Сумма треугольных чисел: " + summ);
        System.out.println("Произведение треугольных чисел: " + multiplay);
    }}

