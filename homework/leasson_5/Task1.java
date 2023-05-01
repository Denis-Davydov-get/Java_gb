package homework.leasson_5;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
//Нужны методы добавления новой записи в книгу и метод поиска записей в телефонной книге
public class Task1 {
    public static void main(String[] args) {
        Phones phones = new Phones();
        phones.add("Тарасов", 951995951);
        phones.add("Новиков", 957774834);
        phones.add("Тарасов", 951995951);
        phones.add("Малахова", 951995951);
        System.out.println(phones.print());
        System.out.println(phones.getNumber("Тарасов"));
        System.out.println(phones.getByNumber(95199591));
    }
}