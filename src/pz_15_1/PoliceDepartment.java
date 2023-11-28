package pz_15_1;

public class PoliceDepartment extends Building implements SocialHouse{
    private int numberOfDepartment;
    private int countOfWorkers;
    private boolean isUsed;

    public PoliceDepartment(int numberOfDepartment, int countOfWorkers, boolean isUsed, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setNumberOfDepartment(numberOfDepartment);
        setCountOfWorkers(countOfWorkers);
        setIsUsed(isUsed);
    }


    public void newNumberOfDepartment(int g){
        this.numberOfDepartment = numberOfDepartment + g;
    }
    public void newCountOfWorkers(int m){
        this.countOfWorkers = countOfWorkers + m;
    }
    public void isUsed(){
        if(!isUsed){
            this.isUsed = true;
            System.out.println("Отделение полиции начало использоваться");
        } else{
            System.out.println("Отделении полиции используется");
        }
    }
    @Override
    public String toString(){
        return super.toString() + "\nНомер отделения: " + getNumberOfDepartment() + "\nКоличество сотрудников: " +  getCountOfWorkers() + "\nИспользуется ли:" +  isIsUsed();
    }
    @Override
    public void display() {
        System.out.println("Я отделение полиции");
        System.out.println("Номер отделения: " + getNumberOfDepartment() + "\nКоличество сотрудников: " +  getCountOfWorkers() + "\nИспользуется ли:" +  isIsUsed());
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        this.numberOfDepartment = numberOfDepartment;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public boolean isIsUsed() {
        return isUsed;
    }

    public void setIsUsed(boolean isUsed) {
        this.isUsed = isUsed;
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
