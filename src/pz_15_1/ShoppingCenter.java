package pz_15_1;

public class ShoppingCenter extends Building implements SocialHouse{
    private int countOfFloors;
    private int countOfShops;
    private boolean isPopular;

    public ShoppingCenter(int countOfFloors, int countOfShops, boolean isUsed, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setCountOfFloors(countOfFloors);
        setCountOfShops(countOfShops);
        setIsPopular(isPopular);
    }

    public void newCountOfFloors(int h){
        this.countOfFloors = countOfFloors + h;
    }
    public void newCountOfShops(int r){
        this.countOfShops = countOfShops + r;
    }
    public void isPopular(){
        if(!isPopular){
            this.isPopular = true;
            System.out.println("Урааа, теперь этот торговый центр посещают много людей");
        } else{
            System.out.println("Этот торговый центр популярен");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество этажей: " + getCountOfFloors() + "\nКоличество магазинов: " +  getCountOfShops() + "\nПопулярный ли:" +  isIsPopular();
    }
    @Override
    public void display() {
        System.out.println("Я торговый центр");
        System.out.println("Количество этажей: " + getCountOfFloors() + "\nКоличество магазинов: " +  getCountOfShops() + "\nПопулярный ли:" +  isIsPopular());
    }


    public int getCountOfFloors() {
        return countOfFloors;
    }

    public void setCountOfFloors(int countOfFloors) {
        this.countOfFloors = countOfFloors;
    }

    public int getCountOfShops() {
        return countOfShops;
    }

    public void setCountOfShops(int countOfShops) {
        this.countOfShops = countOfShops;
    }

    public boolean isIsPopular() {
        return isPopular;
    }

    public void setIsPopular(boolean isPopular) {
        this.isPopular = isPopular;
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
