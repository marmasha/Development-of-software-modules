package pz_14_1;


    class Bird extends Animal {
        private boolean isFly = true;
        private String area;
        private boolean winterFly;
        private String type = "Bird";
        private static int count = 0;
        private int number;

        public Bird(String name, String area, boolean winterFly) {
            super("Bird", name);
            setType(type);
            setFly(isFly);
            setArea(area);
            setWinterFly(winterFly);
            count++;
            number = count;
        }

        static {
            defaultName = "Cacadu";
            defaultType = "Birdbird";
        }

        private static String defaultName;
        private static String defaultType;

        public Bird() {
            setType(defaultType);
            setName(defaultName);
            count++;
            number = count;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public void setWinterFly(boolean winterFly) {
            this.winterFly = winterFly;
        }

        public String getArea() {
            return this.area;
        }

        public boolean isWinterFly() {
            return this.winterFly;
        }

        public void chiriсk_chiriсk() {
            System.out.println("Chiriсk-Chiriсk");
        }

        public void display() {
            System.out.printf("I am a %s\n", type);
            super.display();
            System.out.printf("Area: %s\nIs WinterFly: %b", area, winterFly);
        }

        public String toString() {
            return String.format("Number: %d\nType: %s \nName: %s \nAge: %d \nWeight: %.2f \nIs Fly?: %b \nIs Walk?: %b \nIs Swim?: %b\nArea: %s \nIs WinterFly?: %b\n",
                    number, getType(), getName(), getAge(), getWeight(), isFly(), isWalk(), isSwim(), area, winterFly);
        }
    }

