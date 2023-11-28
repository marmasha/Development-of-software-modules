package pz_13_2;

public class Divider {
    String name;
    String color;
    double price;
    double length;
    boolean isDraw;
    String dividerType;
    boolean metal;

    public Divider(String name, String color, double price, double length, boolean isDraw, String dividerType, boolean metal){
        this.name = name;
        this.color = color;
        this.price = price;
        this.length = length;
        this.isDraw = isDraw;
        this.dividerType = dividerType;
        this.metal = metal;
    }


    public void draw_circle() {
        System.out.println("Нарисован круг");
    }


    public void display(){
        System.out.println("This is Divider");
        System.out.println("\tName: " + name +
                "\nColor: " + color +
                "\nPrice: " + price +
                "\nLenght: " + length +
                "\nDraw: " + isDraw +
                "\nDivider type: " + dividerType +
                "\nMetal: " + metal);
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDividerType() {
        return this.dividerType;
    }
    public void setDividerType(String dividerType) {
        this.dividerType = dividerType;
    }

    public boolean isMetal() {
        return this.metal;
    }
    public void setMetal(boolean metal) {
        this.metal = metal;
    }

}
