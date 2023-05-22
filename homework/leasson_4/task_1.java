package homework.leasson_4;

import java.util.LinkedList;
import java.util.ListIterator;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
//        Постараться не обращаться к листу по индексам.
public class task_1 {
    public static void main(String[] args) {

        reversArray();
     }
    public static void reversArray(){
        LinkedList<Integer> reversList = new LinkedList<>();
        for (int i = 1; i < 11; i++) {
            reversList.add(i);
        }
        ListIterator<Integer> iterator = reversList.listIterator(reversList.size());
        while (iterator.hasPrevious()){
            System.out.print(iterator.previous() + " ");

        }


    }
}
