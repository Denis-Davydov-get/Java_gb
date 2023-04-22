//Формат входных данных:
//На первой строке вводится любимая буква Маши,
//на второй - Олега. Затем вводится строка, в которой перечислены слова,
//которые написаны в газете.
//Формат выходных данных:
//На первой строчке выведите, сколько слов выписала Маша,
//а на второй - сколько слов выписал Олег.
//Sample Input:
//а
//в
//Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
//Sample Output:
//7
//5

package Java_learning.seminar.seminar_2;

public class Task_2 {
    public static void main(String[] args) {
        String str="Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        String[] words=str.split(" ");
        char _letter1='а',_letter2='в';
        int count1=0,count2=0;
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(_letter1)!=-1)
                count1++;
        }
        for(int i=0;i<words.length;i++){
            if(words[i].indexOf(_letter2)!=-1)
                count2++;
        }
        System.out.println(count1);
        System.out.println(count2);
    }

}
