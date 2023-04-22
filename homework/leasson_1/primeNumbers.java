//Вывести все простые числа от 1 до 1000
//2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107
package Java.homework;
public class primeNumbers {
    public static void main(String[] args)
    {
        for (int i = 2; i <= 1000; i++) {
            boolean prime = true;
            for (int j = 2; j < i ; j++) {
                if(i % j == 0){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.printf("%d, " ,i);
            }
        }
        }
    }
