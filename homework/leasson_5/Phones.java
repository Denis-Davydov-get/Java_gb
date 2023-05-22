package homework.leasson_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phones {
    private Map<String, List<Integer>> map = new HashMap();

    void add(String lastName, int number){  // метод добавления контакта в список
        if (map.containsKey(lastName)){     // если нашел такую фамилию, добавляет новые телефон в список
            map.get(lastName).add(number);
        } else {          // если не нашел, создает новый список и добавляет новый контакт
            List<Integer> list = new ArrayList<>();
            list.add(number);
            map.put(lastName, list);
        }
    }
    String getNumber(String lastName){  // метод получения фамилии из списка
        StringBuilder res = new StringBuilder();
        if (map.containsKey(lastName)){  // если нашел фамилию
            res.append(lastName + ":\n");
            for (int i = 0; i < map.get(lastName).size(); i++) { // + StringBuilder все номера по фамилии
                res.append((i+1) + ") " + map.get(lastName).get(i) + "\n");
            }
        } else{  // если не нашел фамилию
            res.append("Такого контакта нет");
        }
        return res.toString();
    }

    String getByNumber(int number){ // метод получения номера из списка
        String res = "";
        for(Map.Entry<String,List<Integer>> entry: map.entrySet()){  // forech перебирает по ключу значения
            if (entry.getValue().contains(number)){ // если находит номер
                res = entry.getKey() + " имеет номер " + number + "\n"; // выводит фамилию и номер
                return res;
            }
            else { // если не находит
                res = "Нет такого номера\n";
            }
        }
        return res;
    }

    String print(){ // выводит весь список фамилий и номеров
        return map.toString();
    }
}