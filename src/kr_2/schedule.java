package kr_2;

public class schedule extends University{
    private String nameeeee;
    private String group;
    private String teacher;

    public schedule(String nameeeee, String group, String teacher, String name, String city, String address, int countOfMajors, boolean preparatoryCourses) {
        super(name, city, address, countOfMajors, preparatoryCourses);
        setNameeeee(nameeeee);
        setGroup(group);
        setTeacher(teacher);
    }
    @Override
    public String toString(){
        return super.toString() + "\nНазвание: " + getNameeeee() + "\nГруппа: " +  getGroup() + "\nПреподаватель: " +  getTeacher();
    }
    @Override
    public void display() {
        System.out.println("Название: " + getNameeeee() + "\nГруппа: " +  getGroup() + "\nПреподаватель: " +  getTeacher());
    }
    public String getNameeeee() {
        return nameeeee;
    }

    public void setNameeeee(String nameeeee) {
        this.nameeeee = nameeeee;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
