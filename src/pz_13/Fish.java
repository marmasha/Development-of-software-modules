package pz_13;

public class Fish {
    String name;
    String squama;
    boolean upStreamSwim;

    public Fish(String name, String squama, boolean upStreamSwim) {

        this.name = name;
        this.squama = squama;
        this.upStreamSwim = upStreamSwim;
    }

    public Fish() {
    }

//    public void display() {
//        System.out.println("Имя: " + this.name + "\t Тип чешуи: " + this.squama + "\t Умеет плавать против течения: " + ((this.upStreamSwim == true) ? "Да" : "Нет"));
//    }
public void display() {
    System.out.println("I am a Fish");
    System.out.println("Имя: " + this.name + "\t Тип чешуи: " + this.squama + "\t Умеет плавать против течения: " + ((this.upStreamSwim == true) ? "Да" : "Нет"));
}

    public void bul_bul() {
        System.out.println("bul_bul");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSquama() {
        return this.squama;
    }

    public void setSquama(String squama) {
        this.squama = squama;
    }

    public boolean isUpStreamSwim() {
        return this.upStreamSwim;
    }

    public void setUpStreamSwim(boolean upStreamSwim) {
        this.upStreamSwim = upStreamSwim;
    }
}
