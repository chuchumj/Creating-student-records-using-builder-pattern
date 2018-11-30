// //student records (builder pattern)
public class StudentfileBuilder {
    private String firstname;
    private String surname;
    private int age;
    private char sex;
    private double gpa;

    public StudentfileBuilder setFirstname(String firstname){
        this.firstname = firstname;
        return this;
    }

    public StudentfileBuilder setSurname(String surname){
        this.surname = surname;
        return this;
    }

    public StudentfileBuilder setAge(int age){
        this.age = age;
        return this;
    }

    public StudentfileBuilder setSex(char sex){
        this.sex = sex;
        return this;
    }

    public StudentfileBuilder setGpa(double gpa){
        this.gpa = gpa;
        return this;
    }

    public Studentfile build() {
        return new Studentfile(firstname,surname,age,sex,gpa);
    }

    public StudentfileBuilder reset()

    {
        return null;
    }

}