package pz_15_1;

public class Library extends Building implements SocialHouse{
    private int countOfFloors;
    private int countOfSections;
    private boolean isFilled;

    public Library(int countOfFloors, int countOfSections, boolean isFilled, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setCountOfFloors(countOfFloors);
        setCountOfSections(countOfSections);
        setIsFilled(isFilled);
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество этажей: " + getCountOfFloors() + "\nКоличество отделов: " +  getCountOfSections() + "\nПереполнен ли:" +  isIsFilled();
    }
    @Override
    public void display() {
        System.out.println("Я библиотека");
        System.out.println("Количество этажей: " + getCountOfFloors() + "\nКоличество отделов: " +  getCountOfSections() + "\nПереполнен ли:" +  isIsFilled());
    }

    public void newCountOfFloors(int o){
        this.countOfFloors = countOfFloors + o;
    }
    public void newCountOfSections(int p){
        this.countOfSections = countOfSections + p;
    }
    public void isFilled(){
        if(!isFilled){
            this.isFilled = true;
            System.out.println("Заполнили библиотеку");
        } else{
            System.out.println("Библиотека заполнена");
        }
    }
    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfSections() {
        return countOfSections;
    }

    public void setCountOfSections(int countOfSections) {
        this.countOfSections = countOfSections;
    }

    public boolean isIsFilled() {
        return isFilled;
    }

    public void setIsFilled(boolean isFilled) {
        this.isFilled = isFilled;
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
        return false;
    }
}
