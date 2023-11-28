package pz_14_1;

public class Animal {
    private String type;
    private String name;
    private int age;
    private double weight;
    private boolean isFly;
    private boolean isWalk;
    private boolean isSwim;
    private static int count = 0;
    private int number;

    public Animal(String name, String type){
        setType(type);
        setName(name);
        count++;
        number = count;
    }

    public Animal(String type, int age) {
        setType(type);
        setAge(age);
        setName("No name");
        count++;
        number = count;
    }

    public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
        setType(type);
        setName(name);
        setAge(age);
        setWeight(weight);
        setFly(isFly);
        setWalk(isWalk);
        setSwim(isSwim);
        count++;
        number = count;
    }

    static {
        defaultName = "Mishka";
        defaultType = "Worm";
    }

    private static String defaultName;
    private static String defaultType;

    public Animal() {
        setType(defaultType);
        setName(defaultName);
        count++;
        number = count;
    }

    private static final String description = "This is the Animal class :)";

    public static void printDescription() {
        System.out.println(description);
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setFly(boolean isFly) {
        this.isFly = isFly;
    }
    public void setWalk(boolean isWalk) {
        this.isWalk = isWalk;
    }
    public void setSwim(boolean isSwim) {
        this.isSwim = isSwim;
    }
    public void display() {
        System.out.printf("Type: %s \nName: %s \nAge: %d \nWeight: %.2f \nIs Fly?: %b \nIs Walk?: %b \nIs Swim?: %b\n", type, name, age, weight, isFly, isWalk, isSwim);
    }
    public final void rename(String name, String newName) {
        if (this.name.equals(name)) this.name = newName;
    }
    public double holiday() {
        return weight += 0.1;
    }
    public double holiday(double m) {
        return weight += m;
    }
    public double holiday(double m, int n) {
        return weight += n * m;
    }
    public String getType() {
        return this.type;
    }
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public double getWeight() {
        return this.weight;
    }
    public boolean isFly() {
        return this.isFly;
    }
    public boolean isSwim() {
        return this.isSwim;
    }
    public boolean isWalk() {
        return this.isWalk;
    }
    public static String getDescription() {
        return description;
    }
    public String toString() {
        return String.format("Number: %d\nType: %s \nName: %s \nAge: %d \nWeight: %.2f \nIs Fly?: %b \nIs Walk?: %b \nIs Swim?: %b\n",
                number, type, name, age, weight, isFly, isWalk, isSwim);
    }
}

