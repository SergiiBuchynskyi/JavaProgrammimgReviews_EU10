package week11_11_19_2022.task4;
/*
Task 4 :

1. create a class named Student that has the followings features:
            Attributes:
                name, gender, dateOfBirth, age, studentID, grade

            Methods:
                sets all the attributes of the student object
                toString(): returns the full info of student Object

2. create a class which is School with main method

3. create a list of student in School class

4. create a method in School class which is getting list of students as parameter the return the list of students if the name start with "A"
 */
public class Student {
public String name, dateOfBirth;
public char gender, grade;
public int age ,studentID;


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", age=" + age +
                ", studentID=" + studentID +
                '}';
    }

    public Student(String name, String dateOfBirth, int age, int studentID, char gender, char grade) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.grade = grade;
        this.age = age;
        this.studentID = studentID;
    }
}
