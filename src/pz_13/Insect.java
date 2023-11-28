package pz_13;

public class Insect {
    String name;
    int wingCount;
    boolean likeJesus;

    public Insect(String name, int wingCount, boolean likeJesus) {

        this.name = name;
        this.wingCount = wingCount;
        this.likeJesus = likeJesus;
    }

    public Insect() {
    }

//    public void display() {
//        System.out.println("Имя: " + this.name + "\t Количество крыльев: " + this.wingCount + "\t Умеет плавать против течения: " + ((this.likeJesus == true) ? "Да" : "Нет"));
//    }

    public void display() {
        System.out.println("I am a Insect");
        System.out.println("Имя: " + name + "\t Количество крыльев: " + wingCount + "\t Умеет плавать против течения: " + ((likeJesus == true) ? "Да" : "Нет"));
    }

    public void ggggg() {
        System.out.println("Ggggg");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWingCount() {
        return this.wingCount;
    }

    public void setWingCount(int wingCount) {
        this.wingCount = wingCount;
    }

    public boolean isLikeJesus() {
        return this.likeJesus;
    }

    public void setLikeJesus(boolean likeJesus) {
        this.likeJesus = likeJesus;
    }
}
