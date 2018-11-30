//// class for student records
class Studentfile{

    private String firstname ;
    private String surname;
    private int age ;
    private char sex;
    private double gpa;
    Studentfile file;



    public Studentfile(String firstname,String surname,int age,char sex,double gpa){

        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.gpa = gpa;
    }

    public Studentfile(String firstname, String surname){
        this.firstname = firstname;
        this.surname = surname;
    }

    public Studentfile(){

    }

    public char getSex() {
        return sex;
    }

    public double getGpa() {
        return gpa;
    }

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

   public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return  " User details \n "+"Firstname:" +getFirstname()+", Lastname:"+ getSurname()+", Age:"+getAge()+", Sex:"+getSex()+" GPA:"+getGpa();
    }

    public static void main(String[] args){
        Studentfile file = new StudentfileBuilder().setFirstname("Ade").setSurname("Kemi").setAge(2).setGpa(2.3).setSex('F').build();
        System.out.println(file);
    }
}