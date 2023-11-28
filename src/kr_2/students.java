package kr_2;

public class students extends University{
    private String nameeee;
    private String speciality;
    private int number;

    public students(String nameeee, String speciality, int number, String name, String city, String address, int countOfMajors, boolean preparatoryCourses) {
        super(name, city, address, countOfMajors, preparatoryCourses);
        setNameeee(nameeee);
        setSpeciality(speciality);
        setNumber(number);
    }

    @Override
    public String toString(){
        return super.toString() + "\nИмя: " + getNameeee() + "\nСпециальность: " +  getSpeciality() + "\nНомер группы: " +  getNumber();
    }
    @Override
    public void display() {
        System.out.println("Имя: " + getNameeee() + "\nСпециальность: " +  getSpeciality() + "\nНомер группы: " +  getNumber());
    }
    public String getNameeee() {
        return nameeee;
    }

    public void setNameeee(String nameeee) {
        this.nameeee = nameeee;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
