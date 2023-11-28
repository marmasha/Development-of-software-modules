package pz_15_1;

public class HighRiseBuilding extends Building implements LivingHouse{
    private int flour;
    private int houseNumber;
    private boolean isParking;

    public HighRiseBuilding(int flour, int houseNumber, boolean isParking, String name, String address, int age, String nameArh, boolean isCulture) {
        super(name, address, age, nameArh, isCulture);
        setFlour(flour);
        setHouseNumber(houseNumber);
        setIsParking(isParking);
    }

    public void newFlour(int a){
        this.flour = flour + a;
    }
    public void newHouseNumber(int b){
        this.houseNumber = houseNumber + b;
    }
    public void newParking(){
        if(!isParking){
           this.isParking = true;
           System.out.println("Добавили парковку :)");
        } else{
            System.out.println("Парковка уже имеется");
        }
    }

    @Override
    public String toString(){
        return super.toString() + "\nКоличество этажей: " + getFlour() + "\nКоличество подъездов: " +  getHouseNumber() + "\nЕсть ли парковка:" +  isParking();
    }
    @Override
    public void display() {
        System.out.println("Я большое большое здание");
        System.out.println("Количество этажей: " + getFlour() + "\nКоличество подъездов: " +  getHouseNumber() + "\nЕсть ли парковка:" +  isParking());
    }

    public int getFlour() {
        return flour;
    }

    public void setFlour(int flour) {
        this.flour = flour;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public boolean isParking() {
        return isParking;
    }

    public void setIsParking(boolean isParking) {
        this.isParking = isParking;
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
        return true;
    }
}
