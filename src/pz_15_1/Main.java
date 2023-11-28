package pz_15_1;

public class Main {
    public static void main(String[] args) {
        HighRiseBuilding building1 = new HighRiseBuilding(2, 5, true, "zdanie", "Solnechnaya 10", 20, "Kolobokov", false);
        building1.newFlour(3);
        building1.newHouseNumber(11);
        building1.display();
        building1.newParking();
        System.out.println(building1.toString());
        System.out.println(building1.isHaveGas());
        System.out.println(building1.isHaveWindows());
        System.out.println(building1.isHaveEntrance());

        System.out.println("-----------------------------------------------------------------------------------------");

        House building2 = new House(1, 2, false, "domik", "Svetlaya 8", 19, "Cvetkov", false);
        building2.newNumberOfHouse(9);
        building2.newNumberOfFloors(1);
        building2.display();
        building2.isCompleted();
        System.out.println(building2.toString());
        System.out.println(building2.isHaveGas());
        System.out.println(building2.isHaveWindows());
        System.out.println(building2.isHaveEntrance());

        System.out.println("-----------------------------------------------------------------------------------------");

        Library building3 = new Library(1, 2, false, "biblioteka", "Bolshaya Sadovaya 40/2", 76, "Wednesday", true);
        building3.newCountOfFloors(1);
        building3.newCountOfSections(20);
        building3.display();
        building3.isFilled();
        System.out.println(building3.toString());
        System.out.println(building3.isFreeVisit());
        System.out.println(building3.isHaveWindows());
        System.out.println(building3.isHaveServises());

        System.out.println("-----------------------------------------------------------------------------------------");

        PoliceDepartment building4 = new PoliceDepartment(11, 2, false, "Police", "Vavilova 5", 43, "Chris Brown", false);
        building4.newNumberOfDepartment(1);
        building4.newCountOfWorkers(20);
        building4.display();
        building4.isUsed();
        System.out.println(building4.toString());
        System.out.println(building4.isFreeVisit());
        System.out.println(building4.isHaveWindows());
        System.out.println(building4.isHaveServises());

        System.out.println("-----------------------------------------------------------------------------------------");

        ShoppingCenter building5 = new ShoppingCenter(4, 3, true, "Center", "Koroleva 23", 22, "Julia Gavrilina", false);
        building5.newCountOfFloors(1);
        building5.newCountOfShops(10);
        building5.display();
        building5.isPopular();
        System.out.println(building5.toString());
        System.out.println(building5.isFreeVisit());
        System.out.println(building5.isHaveWindows());
        System.out.println(building5.isHaveServises());

        System.out.println("-----------------------------------------------------------------------------------------");

        University building6 = new University(3, 300, true, "Uni", "Turgenevskaya 10/6", 33, "Louis Vuitton", true);
        building6.newCountOfFloors(1);
        building6.newCountOfStudents(150);
        building6.display();
        building6.isBudjet();
        System.out.println(building6.toString());
        System.out.println(building6.isFreeVisit());
        System.out.println(building6.isHaveWindows());
        System.out.println(building6.isHaveServises());
    }
}