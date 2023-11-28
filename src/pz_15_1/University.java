package pz_15_1;

public class University extends Building implements SocialHouse{
    private int countOfFloors;
    private int countOfStudents;
    private boolean isBudjet;

    public University(int countOfFloors, int countOfStudents, boolean isBudjet, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setCountOfFloors(countOfFloors);
        setCountOfStudents(countOfStudents);
        setIsBudjet(isBudjet);
    }

    public void newCountOfFloors(int z){
        this.countOfFloors = countOfFloors + z;
    }
    public void newCountOfStudents(int w){
        this.countOfStudents = countOfStudents + w;
    }
    public void isBudjet(){
        if(!isBudjet){
            this.isBudjet = true;
            System.out.println("Урааа, теперь этот университет является бюджетной организацией");
        } else{
            System.out.println("Этот университет является бюджетной организацией");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество этажей: " + getCountOfFloors() + "\nКоличество студентов: " +  getCountOfStudents() + "\nБюджетный ли:" +  isIsBudjet();
    }
    @Override
    public void display() {
        System.out.println("Я университет");
        System.out.println("Количество этажей: " + getCountOfFloors() + "\nКоличество студентов: " +  getCountOfStudents() + "\nБюджетный ли:" +  isIsBudjet());
    }

    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public void setCountOfStudents(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    public boolean isIsBudjet() {
        return isBudjet;
    }

    public void setIsBudjet(boolean isBudjet) {
        this.isBudjet = isBudjet;
    }
    @Override
    public boolean isFreeVisit() {
        System.out.println("Бесплатное посещение: ");
        return true;
    }

    @Override
    public boolean isHaveWindows() {
        System.out.println("Есть ли окна: ");
        return true;
    }

    @Override
    public boolean isHaveServises() {
        System.out.println("Есть платные услуги: ");
        return true;
    }
}
