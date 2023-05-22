//Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметическое из этого списка.
// Collections.max()

package homework.leasson_3;

import java.util.ArrayList;
import java.util.List;

public class MinMaxAverage {
        static public void main(String[] args) {
                List<Integer> list = createList(10, 4, 10);
                System.out.println(list);
                System.out.println("Max: " + listMax(list));
                System.out.println("Min: " + listMin(list));
                System.out.println("average: " + average(list));
        }
        static List<Integer> createList(int capacity, int min, int max) {
                List<Integer> result = new ArrayList<>(capacity);
                for (int i = 0; i < max; i++) {
                        result.add((int) (Math.random() * (max - min + 1) + min));
                }
                return result;
        }
        static int listMax(List<Integer> list) {
                int maxValue = list.get(0);
                for(int i=1;i < list.size();i++){
                        if(list.get(i) > maxValue){
                        maxValue = list.get(i);
                        }
                }
                return maxValue;
        }
        static int listMin(List<Integer> list) {
                int maxValue = list.get(0);
                for(int i=1;i < list.size();i++){
                        if(list.get(i) < maxValue){
                                maxValue = list.get(i);
                        }
                }
                return maxValue;
        }
        static double average(List<Integer> list) {
                int sum = 0;
                double result = 0d;
                for(int i=0;i < list.size();i++){
                        sum += list.get(i);
                }
                result = sum / list.size();
                return result;
        }
}