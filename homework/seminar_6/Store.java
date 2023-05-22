package homework.seminar_6;

import java.util.*;
public class Store {
    private Set<Laptop> Laptops = new HashSet();
    public void add(Laptop Laptop) {
        Laptops.add(Laptop);
    }
    public void print() {
        for (Laptop Laptop : Laptops) {
            System.out.println(Laptop.getBrand() + " " + Laptop.getModel() + " " +
                    Laptop.getOS() + " " + Laptop.getRam() + "GB " + Laptop.getHdSize() + "GB");
        }
    }
    public void filter() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 - ОЗУ");
            System.out.println("2 - Объем ЖД");
            System.out.println("3 - Операционная система");
            System.out.println("4 - Бренд");
            System.out.print("Введите цифру, соответствующую необходимому параметру: ");
            int userInput = sc.nextInt();
            int minValue = 0;
            Object osValue;
            switch (userInput) {
                case 1:
                    System.out.println("Введите минимальный объем ОЗУ (в гигабайтах) > ");
                    minValue = sc.nextInt();
                    for (Laptop Laptop : Laptops) {
                        if (Laptop.getRam() >= minValue) {
                            System.out.println(Laptop.getBrand() + " " + Laptop.getModel() + " " +
                                    Laptop.getOS() + " " + Laptop.getRam() + "GB " + Laptop.getHdSize() + "GB");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Введите минимальный объем ЖД (в гигабайтах) > ");
                    minValue = sc.nextInt();
                    for (Laptop Laptop : Laptops) {
                        if (Laptop.getHdSize() >= minValue) {
                            System.out.println(Laptop.getBrand() + " " + Laptop.getModel() + " " +
                                    Laptop.getOS() + " " + Laptop.getRam() + "GB " + Laptop.getHdSize() + "GB");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Введите название ОС: Windows Linux MacOS > ");
                    sc.nextLine();
                    osValue = sc.nextLine();
                    for (Laptop Laptop : Laptops) {
                        if (Laptop.getOS().equals(osValue)) {
                            System.out.println(Laptop.getBrand() + " " + Laptop.getModel() + " " +
                                    Laptop.getOS() + " " + Laptop.getRam() + "GB " + Laptop.getHdSize() + "GB");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Введите название Бренда: Acer Asus Dell HP Lenovo > ");
                    sc.nextLine();
                    osValue = sc.nextLine();
                    for (Laptop Laptop : Laptops) {
                        if (Laptop.getBrand().equals(osValue)) {
                            System.out.println(Laptop.getBrand() + " " + Laptop.getModel() + " " +
                                    Laptop.getOS() + " " + Laptop.getRam() + "GB " + Laptop.getHdSize() + "GB");
                        }
                    }
                    break;
                default:
                    System.out.println("Некорректный выбор параметра.");
            }
        }
    }
}