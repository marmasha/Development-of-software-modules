package kr_2;

public class Inventory extends University implements countOfInventory{
    private String namee;
    private boolean inStock;
    private int count;

    public Inventory(String namee, boolean inStock, int count, String name, String city, String address, int countOfMajors, boolean preparatoryCourses) {
        super(name, city, address, countOfMajors, preparatoryCourses);
        setNamee(namee);
        setInStock(inStock);
        setCount(count);
    }
    @Override
    public String toString(){
        return super.toString() + "\n \nНазвание: " + getNamee() + "\nЕсть в наличии: " +  isInStock() + "\nКоличество:" +  getCount();
    }
    @Override
    public void display() {
        System.out.println("\nНазвание: " + getNamee() + "\nЕсть в наличии: " +  isInStock() + "\nКоличество:" +  getCount());
    }

    public String getNamee() {
        return namee;
    }

    public void setNamee(String namee) {
        this.namee = namee;
    }

    public boolean isInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int reductionInQuantity(int m) {
        System.out.print("Количество учебников после уменьшения = ");
        this.count = count - m;
        return this.count;
    }

    @Override
    public int increaseInQuantity(int p) {
        System.out.print("Количество учебников после увеличения = ");
        this.count = count + p;
        return this.count;
    }
    static int newCount(int a){
        System.out.print("Новое количество: ");
        return a;
    }
    static int newCount(int a, int b){
        System.out.print("Новое количество: ");
        return (a + b);
    }

    private static final String description = "This is the inventory class :)";
    public static void printDescription() {
        System.out.println(description);
    }
}
