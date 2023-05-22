package homework.leasson_3;

import java.util.ArrayList;
import java.util.List;

//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class sortListNehet {
    public static void main(String[] args) {
        List<Integer> list = createList(10, 4, 10);
        System.out.println(list);
        System.out.println(sortList(list));
    }

    static List<Integer> createList(int capacity, int min, int max) {
        List<Integer> result = new ArrayList<>(capacity);
        for (int i = 0; i < max; i++) {
            result.add((int) (Math.random() * (max - min + 1) + min));
        }
        return result;
    }

    static List<Integer> sortList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        return list;
    }
}