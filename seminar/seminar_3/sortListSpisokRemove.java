package Java.seminar.seminar_3;

import java.util.ArrayList;
import java.util.List;

public class sortListSpisokRemove {
//    Создать список типа ArrayList
//    Поместить в него как строки, так и целые числа.
//    Пройти по списку, найти и удалить целые числа.
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(5);
        list.add("5");
        list.add(10);
        list.add("Привет");
        list.add(5.1);
        list.add(null);
        System.out.println(list);
        removeInteger(list);
        System.out.println(list);
    }
    public static void removeInteger(List list) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                list.remove(i);
                i--;
            }
        }
    }
}
