package pz_15_1;

public class House extends Building implements LivingHouse{
    private int numberOfHouse;
    private int numberOfFloors;
    private boolean isCompleted;

    public House(int numberOfHouse, int numberOfFloors, boolean isCompleted, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setNumberOfHouse(numberOfHouse);
        setNumberOfFloors(numberOfFloors);
        setIsCompleted(isCompleted);
    }

    @Override
    public String toString(){
        return super.toString() + "\nНомер дома: " + getNumberOfHouse() + "\nКоличество этажей: " +  getNumberOfFloors() + "\nДостроен ли:" +  isIsCompleted();
    }
    @Override
    public void display() {
        System.out.println("Я дом :)");
        System.out.println("Номер дома: " + getNumberOfHouse() + "\nКоличество этажей: " +  getNumberOfFloors() + "\nДостроен ли:" +  isIsCompleted());
    }

    public void newNumberOfHouse(int n){
        this.numberOfHouse = numberOfHouse + n;
    }
    public void newNumberOfFloors(int u){
        this.numberOfFloors = numberOfFloors + u;
    }
    public void isCompleted(){
        if(!isCompleted){
            this.isCompleted = true;
            System.out.println("Достроили дом :)");
        } else{
            System.out.println("Дом уже достроен");
        }
    }

    public int getNumberOfHouse() {
        return numberOfHouse;
    }

    public void setNumberOfHouse(int numberOfHouse) {
        this.numberOfHouse = numberOfHouse;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public boolean isIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public boolean isHaveGas() {
        System.out.println("Есть ли газ: ");
        return true;
    }

    @Override
    public boolean isHaveWindows() {
        System.out.println("Есть ли окна: ");
        return true;
    }

    @Override
    public boolean isHaveEntrance() {
        System.out.println("Есть ли подъезды: ");
        return false;
    }
}
