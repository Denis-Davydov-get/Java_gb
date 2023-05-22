package homework.leasson_4;
//Найдите сумму всех элементов LinkedList, сохраняя все элементы в списке.
// Используйте итератор

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;


public class task_3 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList  = new LinkedList<Integer>(Arrays.asList( 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 ));
        System.out.println(linkedList);
        System.out.println(sumElements(linkedList));

    }
    static LinkedList<Integer> sumElements(LinkedList list){
        LinkedList<Integer> listSumm = new LinkedList<>();
        ListIterator<Integer> iterator = list.listIterator(list.size());
        int sum = 0;
        while (iterator.hasPrevious()){
            sum += iterator.previous();
            listSumm.add(sum);
        }
        System.out.println(sum);

    return listSumm;
    }

}
