package pz_13;

public class Bird{
    String name;
    String area;
    boolean winterFly;

    public Bird(String name, String area, boolean winterFly) {

        this.name = name;
        this.area = area;
        this.winterFly = winterFly;
    }
    public Bird() {
    }
//    public void display() {
//        System.out.println("Имя: " + this.name + "\t Зона обитания: " + this.area + "\t Умеет зимовать: " + ((this.winterFly == true)? "Да": "Нет"));
//    }

    public void display() {
        System.out.println("I am a Bird");
        System.out.println("Имя: " + this.name + "\t Зона обитания: " + this.area + "\t Умеет зимовать: " + ((this.winterFly == true)? "Да": "Нет"));
    }
    public void chirick_chirick(){
        System.out.println("Chirick_Chirick");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return this.area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public boolean isWinterFly() {
        return this.winterFly;
    }

    public void setWinterFly(boolean winterFly) {
        this.winterFly = winterFly;
    }
}
