package week11_11_19_2022.task4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student("AJohn", "10.03.2001", 22, 31154, 'M', 'A');
        Student student2 = new Student("Marry", "23.01.2000", 21, 31158, 'F', 'B');

        ArrayList<Student>students = new ArrayList<>();
        students.addAll(Arrays.asList(student1,student2));

        System.out.println(listOfStudentsOnA(students));
    }




    public static ArrayList listOfStudentsOnA(ArrayList<Student>std){
        ArrayList listOfStudentsOnA = new ArrayList<>();

        for (Student student : std) {
            if (student.name.startsWith("A")){
                listOfStudentsOnA.add(student);
            }
        }return listOfStudentsOnA;
    }
}
