package pz_13_2;

public class Pen {
    String name;
    String color;
    double price;
    double length;
    boolean isDraw;
    int countColor;
    boolean auto;

    public Pen(String name, String color, double price, double length, boolean isDraw, int countColor, boolean auto){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
        this.countColor = countColor;
        this.auto = auto;
    }


    public void writeMyName() {
        System.out.println("Kolobok");
    }


    public void display(){
        System.out.println("This is Pen");
        System.out.println("\tName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price +
                "\nLenght: " + length +
                "\nDraw: " + isDraw +
                "\nCount color: " + countColor +
                "\nAuto: " + auto);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getCountColor() {
        return this.countColor;
    }
    public void setCountColor(int countColor) {
        this.countColor = countColor;
    }
    public boolean isAuto() {
        return this.auto;
    }
    public void setAuto(boolean auto) {
        this.auto = auto;
    }

}
