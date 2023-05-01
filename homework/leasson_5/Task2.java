package homework.leasson_5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        String users = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";
        List<String> list = new ArrayList<>();
        users.split(", ");
        list.add(users);
//        list.add("Ivan ������");
//        list.add("Svetlana �������");
//        list.add("Kristina ������");
//        list.add("Anna ������");
//        list.add("Anna �������");
//        list.add("Ivan ����");
//        list.add("Petr �����");
//        list.add("Pavel ������");
//        list.add("Petr ��������");
//        list.add("Mary ��������");
//        list.add("Marina ��������");
//        list.add("Mary ������");
//        list.add("Mary ������");
//        list.add("Marina ������");
//        list.add("Anna �����������");
//        list.add("Ivan ��������");
//        list.add("Petr �����");
//        list.add("Ivan ����");

        showNames(list);

    }

    static Map<Integer,List<String>> getMap(List<String> list){
        Map<Integer,List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 0; i < list.size(); i++) {
            String[] fi = list.get(i).split(" ");
            if (isName(map,fi[0])){
                int key = getKey(map,fi[0]);
                map.get(key).remove(fi[0]);
                if (map.containsKey(++key)){
                    map.get(key).add(fi[0]);
                } else {
                    List<String> names = new ArrayList<>();
                    names.add(fi[0]);
                    map.put(key, names);
                }
            } else {
                if(map.isEmpty()){
                    List<String> names = new ArrayList<>();
                    names.add(fi[0]);
                    map.put(1, names);
                } else {
                    map.get(1).add(fi[0]);
                }
            }
        }
        return map;
    }

    static boolean isName (Map<Integer,List<String>> map, String name){
        for(int x: map.keySet()){
            if(map.get(x).contains(name)){
                return true;
            }
        }
        return false;
    }

    static int getKey (Map<Integer,List<String>> map, String name){
        for (Map.Entry<Integer,List<String>> entry: map.entrySet()){
            if (entry.getValue().contains(name)){
                return entry.getKey();
            }
        }
        return 0;
    }

    static void showNames(List<String> list){
        Map<Integer,List<String>> map = getMap(list);
        for (Map.Entry<Integer,List<String>> entry: map.entrySet()){
            if(entry.getKey() > 1)
                System.out.println(entry.getValue().toString() + " repeat " +
                        entry.getKey() + " times\n");
        }
    }
}