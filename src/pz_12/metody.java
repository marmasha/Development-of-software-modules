package pz_12;

class metody {
    public static void main(String[] args){
        Animal tiger = new Animal();
        tiger.type = "тигр";
        tiger.name = "Артём";
        tiger.age = 15;
        tiger.weight = 300.6;
        tiger.isSwim = true;
        tiger.isWalk = true;
        tiger.isFly = false;
        tiger.display();
        tiger.rename("Антон");
        tiger.display();

        Animal sparrow = new Animal();
        sparrow.type = "воробей";
        sparrow.name = "Капитан Джек";
        sparrow.age = 3;
        sparrow.weight = 2;
        sparrow.isSwim = false;
        sparrow.isWalk = true;
        sparrow.isFly = true;
        sparrow.display();
        sparrow.holiday(2);
        sparrow.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        Animal tiger1 = new Animal("тигр", "Артём");
        tiger1.age = 15;
        tiger1.weight = 300.6;
        tiger1.isSwim = true;
        tiger1.isWalk = true;
        tiger1.isFly = false;
        tiger1.display();

        Animal sparrow2 = new Animal("воробей", 5);
        sparrow2.weight = 2;
        sparrow2.isSwim = false;
        sparrow2.isWalk = true;
        sparrow2.isFly = true;
        sparrow2.display();

        Animal duck = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck.holiday(5);
        duck.rename("Утя-утя");
        duck.display();

        System.out.println("-----------------------------------------------------------------------------------------");

        Animal tiger3 = new Animal("тигр", "Артём");
        tiger3.setAge(15);
        tiger3.setWeight(300.6);
        tiger3.setSwim(true);
        tiger3.setWalk(true);
        tiger3.setFly(false);
        tiger3.display();

        Animal duck2 = new Animal("Утка", "Утя", 3, 5.8, true, true, true);
        duck2.holiday(5);
        duck2.rename("Утя-утя");
        duck2.display();
        System.out.println(duck2.getAge());
        System.out.println(duck2.getName());
        System.out.println(duck2.getWeight());
        System.out.println(duck2.getType());
        System.out.println(duck2.isSwim());
        System.out.println(duck2.isWalk());
        System.out.println(duck2.isFly());
    }
}



