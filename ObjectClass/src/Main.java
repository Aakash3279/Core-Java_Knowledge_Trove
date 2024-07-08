//java.lang.obj

public class Main extends Object{
    public static void main(String[] args) {
        Student ram = new Student("Ram",21);
        System.out.println(ram);

        PrimarySchoolStudent shyam = new PrimarySchoolStudent("Shyam", 10, "Ravi");
        System.out.println(shyam);
    }
}

class Student{
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name +" is "+ age +" years old";
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    PrimarySchoolStudent(String name,int age,String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return parentName+"'s kid, "+ super.toString();
    }
}