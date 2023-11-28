package pz_12;

public class metody_2 {
    public static void main(String[] args){
        WritingMaterials pen = new WritingMaterials();
        pen.name = "ручка";
        pen.color = "красный";
        pen.length = 15.6;
        pen.price = 145;
        pen.draw = true;
        pen.display();
        pen.draw();
        pen.priceDown(10);
        pen.display();
        pen.priceUp(23);
        pen.display();
        pen.replace_rod("синий");
        pen.draw();

        WritingMaterials ruler = new WritingMaterials();
        ruler.name = "линейка";
        ruler.length = 30.0;
        ruler.price = 25;
        ruler.draw = false;
        ruler.display();
        ruler.draw();
        ruler.priceUp(13);
        ruler.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        WritingMaterials pen1 = new WritingMaterials("ручка", "Красный", 145, 15.6, true);
        pen1.display();
        pen1.draw();
        pen1.priceDown(10);
        pen1.display();
        pen1.priceUp(23);
        pen1.display();
        pen1.replace_rod("Синий");
        pen1.draw();

        WritingMaterials ruler1 = new WritingMaterials("линейка", 34);
        ruler1.display();
        ruler1.draw();

        WritingMaterials wm1 = new WritingMaterials(23, 67.8, false);
        wm1.display();
        wm1.draw();

        WritingMaterials wm2 = new WritingMaterials("Циркуль", "Зелёный");
        wm2.draw = true;
        wm2.display();
        wm2.draw();

        System.out.println("-----------------------------------------------------------------------------------------");

        WritingMaterials pen2 = new WritingMaterials();
        pen2.setName("ручка");
        pen2.setColor("красный");
        pen2.setLength(11.6);
        pen2.setPrice(167);
        pen2.setDraw(true);
        pen2.display();
        pen2.draw();
        pen2.priceDown(10);
        pen2.display();
        pen2.priceUp(23);
        pen2.display();
        pen2.replace_rod("Синий");
        pen2.draw();
        System.out.println(pen2.getName());
        System.out.println(pen2.getColor());
        System.out.println(pen2.getLength());
        System.out.println(pen2.getPrice());
        System.out.println(pen2.isDraw());
    }
}
