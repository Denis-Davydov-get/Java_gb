package seminar.seminar_4;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
public class consoleProgram {
    public static void main(String[] args) {
        ex2();
    }

    static void ex2(){
        /*
        Принимает от пользователя и “запоминает” строки.
        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
        Если введено revert, удаляет предыдущую введенную строку из памяти.
         */
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> list = new LinkedList<>();
        while (work) {
            System.out.println("Введите команду");
            String line = scanner.nextLine();
            switch (line){
                case "print":
                    ListIterator<String> iterator = list.listIterator(list.size());
                    while (iterator.hasPrevious()){
                        System.out.println(iterator.previous());
                    }
                    break;
                case "exit":
                    System.out.println("До новых встреч");
                    work = false;
                    break;
                case "revert":
                    list.removeLast();
                    break;
                default:
                    list.add(line);
            }
        }
    }
}