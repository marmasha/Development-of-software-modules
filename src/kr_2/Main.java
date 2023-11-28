package kr_2;

import pz_15_1.HighRiseBuilding;

public class Main {
    public static void main(String[] args) {
        Inventory books = new Inventory("books", true, 100, "RKSI", "Rostov-on-Don", "Turgenevskaya 10/6", 13, true);
        System.out.println(books.toString());

        System.out.println("-----------------------------------------------------------------------------------------");

        employees human = new employees("Kostromina Veronika", 17, "Education department employee", "RKSI", "Rostov-on-Don", "Turgenevskaya 10/6", 13, true);
        human.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        students student = new students("Olga Oranskaya", "IS", 33,"RKSI", "Rostov-on-Don", "Turgenevskaya 10/6", 13, true);
        student.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        schedule lesson = new schedule("Development of software modules", "IS-33", "Koshkina A.A.","RKSI", "Rostov-on-Don", "Turgenevskaya 10/6", 13, true);
        lesson.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Проверка работы интерфейса:");
        System.out.println(books.reductionInQuantity(50));
        System.out.println(books.increaseInQuantity(200));

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("Проверка использования полиморфизма: ");
        System.out.println(books.newCount(10));
        System.out.println(books.newCount(50,75));

        System.out.println("-----------------------------------------------------------------------------------------");

        System.out.println("final and static: ");
        books.printDescription();
    }
}
