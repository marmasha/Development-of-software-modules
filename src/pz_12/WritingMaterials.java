package pz_12;

public class WritingMaterials {
    String name;
    String color;
    double length;
    double price;
    boolean draw;

    public WritingMaterials(String name, String color){
        this.name = name;
        this.color = color;
    }
    public WritingMaterials(){
    }
    public WritingMaterials(String name, double price){
        this.name = name;
        this.color = "No Color";
        this.price = price;
    }
    public WritingMaterials(double price, double length, boolean draw){
        this.price = price;
        this.name = "No name";
        this.color = "No Color";
        this.draw = draw;
    }
    public WritingMaterials(String name, String color, double length, double price, boolean draw) {
        this.name = name;
        this.color = color;
        this.length = length;
        this.price = price;
        this.draw = draw;
    }

    public void display(){
        System.out.println("\tName: " + name +
                "\nColor: " + color +
                "\nLenght: " + length +
                "\nPrice: " + price +
                "\nDraw: " + draw);
    }
    public void priceDown(double a){
        price = price - a;
    }
    public void priceUp(double b){
        price = price + b;
    }
    public void replace_rod(String newColor){
        color = newColor;
    }
    public void draw(){
        System.out.println((draw == true)? (name + " провел линию. Её цвет - " + color) : (name + " не может ничего нарисовать."));
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public boolean isDraw() {
        return this.draw;
    }
    public void setDraw(boolean draw) {
        this.draw = draw;
    }

}
