package pz_15_1;

abstract public class Building {
    private String name;
    private String address;
    private int age;
    private String nameArh;
    private boolean isCulture;

    public Building(String name, String address, int age, String nameArh, boolean isCulture){
        setName(name);
        setAddress(address);
        setAge(age);
        setNameArh(nameArh);
        setIsCulture(isCulture);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getNameArh() {
        return this.nameArh;
    }
    public void setNameArh(String nameArh) {
        this.nameArh = nameArh;
    }
    public boolean getIsCulture() {
        return this.isCulture;
    }
    public void setIsCulture(boolean isCulture) {
        this.isCulture = isCulture;
    }

    public String toString(){
        return "Имя: " + name + "\nАдрес: " + address + "\nВозраст: " + age + "\nИмя архитектора: " + nameArh + "\nЯвляется ли культурным памятником: " + isCulture;
    }
    abstract public void display();

}
