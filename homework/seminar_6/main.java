package homework.seminar_6;
public class main {
    public static void main(String[] args) {
        Laptop Laptop1 = new Laptop("Honor", "MagicBook X", "Windows", 8, 512);
        Laptop Laptop2 = new Laptop("Thunderobot", "911 Plus X", "Windows", 16, 512);
        Laptop Laptop3 = new Laptop("Apple", "MacbookPro 16M1", "MacOs", 16, 512);
        Laptop Laptop4 = new Laptop("Asus", "Vivobook", "Linux", 8, 1024);
        Laptop Laptop5 = new Laptop("Acer", "Aspire 3 A315-34-C1JW", "Windows", 4, 256);
        Store store = new Store();
        store.add(Laptop1);
        store.add(Laptop2);
        store.add(Laptop3);
        store.add(Laptop4);
        store.add(Laptop5);
        store.print();
        store.filter();
    }
}