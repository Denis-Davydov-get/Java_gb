// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
package Java_learning.homework.leasson_2;
    public class task_0 {
    public static void main(String[] args) {
        String words = "aB";
        String stones = "aaaAbbbB";
        String[] arrayWords = words.split("");
        String[] arrayStones = stones.split("");
        int count_a = 0;
        int count_B = 0;
        for (int i = 0; i < arrayStones.length; i++) {
            if(arrayStones[i].indexOf(arrayWords[0]) != -1){
                count_a++;
            }
        }
        for (int i = 0; i < arrayStones.length; i++) {
            if(arrayStones[i].indexOf(arrayWords[1]) != -1){
                count_B++;
            }
        }
        System.out.println(arrayWords[0] +  count_a + arrayWords[1] + count_B);
    }
}