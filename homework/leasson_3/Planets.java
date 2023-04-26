//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.
package homework.leasson_3;

import java.util.*;

public class Planets {
    public static void main(String[] args) {
        List<String> namePlanets = new ArrayList<>();
        namePlanets.add("Плутон");
        namePlanets.add("Марс");
        namePlanets.add("Плутон");
        namePlanets.add("Меркурий");
        namePlanets.add("Юпитер");
        namePlanets.add("Уран");
        namePlanets.add("Венера");
        namePlanets.add("Земля");
        namePlanets.add("Марс");
        namePlanets.add("Юпитер");
        printPlanets(namePlanets);

    }

    static void printPlanets(List<String> list) {
        ArrayList<String> sortList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " встречается " + Collections.frequency(list, list.get(i)) + " раз(а)");
        }
    }
}
