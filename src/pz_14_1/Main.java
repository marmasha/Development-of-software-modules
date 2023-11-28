package pz_14_1;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal("Luntik", "Bear");

        System.out.println("Animal 1:");
        animal1.display();

        System.out.println("\nAnimal 2:");
        animal2.display();

        animal1.rename("Misha", "Mismisha"); // Попытка изменить имя

        System.out.println("\nAnimal 1:");
        animal1.display();

        System.out.println("\nТестируем Description\n");
        Animal.printDescription();
        Animal animal3 = new Animal("Carrot", "Cat");
        // Animal.printDescription();

        System.out.println("\nТестируем toString\n");
        Animal animal4 = new Animal();
        Animal animal5 = new Animal("Jozy", "Parrot");

        System.out.println("Animal 4:");
        System.out.println(animal4);

        System.out.println("\nAnimal 5:");
        System.out.println(animal5);
    }
}
