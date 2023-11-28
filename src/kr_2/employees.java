package kr_2;

public class employees extends University{
    private String nameee;
    private int age;
    private String jobTitle;

    public employees(String nameee, int age, String jobTitle, String name, String city, String address, int countOfMajors, boolean preparatoryCourses) {
        super(name, city, address, countOfMajors, preparatoryCourses);
        setNameee(nameee);
        setAge(age);
        setJobTitle(jobTitle);
    }
    @Override
    public String toString(){
        return super.toString() + "\nИмя: " + getNameee() + "\nВозраст: " +  getAge() + "\nДолжность: " +  getJobTitle();
    }
    @Override
    public void display() {
        System.out.println( "Имя: " + getNameee() + "\nВозраст: " +  getAge() + "\nДолжность: " +  getJobTitle());
    }
    public String getNameee() {
        return nameee;
    }

    public void setNameee(String nameee) {
        this.nameee = nameee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
}
