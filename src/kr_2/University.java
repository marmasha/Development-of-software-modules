package kr_2;

abstract public class University {
    private String name;
    private String city;
    private String address;
    private int countOfMajors;
    private boolean preparatoryCourses;

    public University(String name, String city, String address, int countOfMajors, boolean preparatoryCourses){
        setName(name);
        setCity(city);
        setAddress(address);
        setCountOfMajors(countOfMajors);
        setPreparatoryCourses(preparatoryCourses);
    }
    public String toString(){
        return "Название: " + name + "\nГород: " + city + "\nАдрес: " + address + "\nКоличество специальностей: " + countOfMajors + "\nЕсть ли подготовительные курсы: " + preparatoryCourses;
    }

    abstract public void display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCountOfMajors() {
        return countOfMajors;
    }

    public void setCountOfMajors(int countOfMajors) {
        this.countOfMajors = countOfMajors;
    }

    public boolean isPreparatoryCourses() {
        return preparatoryCourses;
    }

    public void setPreparatoryCourses(boolean preparatoryCourses) {
        this.preparatoryCourses = preparatoryCourses;
    }
}
