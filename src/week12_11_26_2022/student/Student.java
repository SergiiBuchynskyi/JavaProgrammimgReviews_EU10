package week12_11_26_2022.student;

public class Student {

    public String name;
    public int age;
    public long batchNumber;

    public static String school = "Cydeo";

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, long batchNumber) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
    }
}
