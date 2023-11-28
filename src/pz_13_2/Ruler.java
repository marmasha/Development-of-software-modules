package pz_13_2;

public class Ruler {
    String name;
    String color;
    double price;
    double length;
    boolean isDraw;
    double length1;
    boolean wood;

    public Ruler(String name, String color, double price, double length, boolean isDraw, double length1, boolean wood){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
        this.length1 = length1;
        this.wood = wood;
    }


    public void measure() {
        System.out.println("Сейчас померяем длину");
    }


    public void display(){
        System.out.println("This is Ruler");
        System.out.println("\tName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price +
                "\nLenght: " + length +
                "\nDraw: " + isDraw +
                "\nLenght: " + length +
                "\nWood: " + wood);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }

    public boolean isWood() {
        return this.wood;
    }
    public void setWood(boolean wood) {
        this.wood = wood;
    }

}
