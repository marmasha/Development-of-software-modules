package pz_12;

public class Animal{
        String type;
        String name;
        int age;
        double weight;
        boolean isFly;
        boolean isWalk;
        boolean isSwim;

        public int rename(String name) {
            this.name = name;
            return 0;
        }

        public Animal(String type, String name) {
            this.type = type;
            this.name = name;
        }

        public Animal() {
        }

        public Animal(String type, int age) {
            this.type = type;
            this.age = age;
            this.name = "No name";
        }

        public Animal(String type, String name, int age, double weight, boolean isFly, boolean isWalk, boolean isSwim) {
            this.type = type;
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.isFly = isFly;
            this.isWalk = isWalk;
            this.isSwim = isSwim;
        }

        public void display() {
            System.out.println("Тип: " + this.type + "\t \nИмя: " + this.name + "\t Возраст: " + this.age + "\t Вес: " + this.weight + "\t Умеет летать: " + ((this.isFly == true)? "Да": "Нет") + "\t Умеет ходить:" + ((this.isWalk == true)? "Да": "Нет") + "\t Умеет плавать:" + ((this.isSwim == true)? "Да": "Нет"));
        }

        public void holiday(int days) {
            for (int i = 0; i < days; i++) {
                this.weight += 0.1;
            }
        }

        public String getType() {
            return this.type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        //Вес.
        public double getWeight() {
            return this.weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public boolean isFly() {
            return this.isFly;
        }

        public void setFly(boolean isFly) {
            this.isFly = isFly;
        }

        public boolean isWalk() {
            return this.isWalk;
        }

        public void setWalk(boolean isWalk) {
            this.isWalk = isWalk;
        }

        public boolean isSwim() {
            return this.isSwim;
        }

        public void setSwim(boolean isSwim) {
            this.isSwim = isSwim;
        }
    }
