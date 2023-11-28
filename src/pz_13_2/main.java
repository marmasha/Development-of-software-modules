package pz_13_2;

public class main {
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

        System.out.println("-----------------------------------------------------------------------------------------");

        Pen p = new Pen("ручка", "Красный", 145, 15.6, false, 0, true);
        p.setName("Паркер");
        p.display();
        p.setCountColor(2);
        p.setAuto(false);
        System.out.println(p.getCountColor());
        System.out.println(p.isAuto());
        p.writeMyName();

        Ruler r = new Ruler("линейка", "желтая", 145, 15.6, true, 15.6, false);
        r.setName("Линейка");
        r.display();
        r.setLength(25);
        r.setWood(true);
        System.out.println(r.getLength());
        System.out.println(r.isWood());
        r.measure();

        Divider d = new Divider("циркуль", "синий", 145, 15.6, false, "без карандаша", false);
        d.setName("Циркуль");
        d.display();
        d.setDividerType("С карандашом");
        d.setMetal(true);
        System.out.println(d.getDividerType());
        System.out.println(d.isMetal());
        d.draw_circle();
    }
}
