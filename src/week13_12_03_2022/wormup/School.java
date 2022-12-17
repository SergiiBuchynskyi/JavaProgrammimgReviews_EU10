package week13_12_03_2022.wormup;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class School {
    static ArrayList<Teacher>teachers = new ArrayList<>();
    static {

        Teacher teacher1 = new Teacher("Muhtar", "Abc", 'M', LocalDate.of(1984, 01, 12), 13);
        Teacher teacher2 = new Teacher("Gurhan", "Abc", 'M', LocalDate.of(1983, 11, 31), 14);
        Teacher teacher3 = new Teacher("Asyun", "Abc", 'F', LocalDate.of(1993, 3, 23), 15);
        Teacher teacher4 = new Teacher("Mike", "Abc", 'M', LocalDate.of(1988, 4, 22), 17);
        Teacher teacher5 = new Teacher("Saim", "Abc", 'F', LocalDate.of(1995, 7, 21), 18);

School.teachers.addAll(Arrays.asList(teacher1,teacher2,teacher3,teacher4,teacher5));


    }

    public static void main(String[] args) {


    }

    private static ArrayList<Teacher> getTeachersStartsWith(String str) {
        ArrayList<Teacher>result = getTeachersStartsWith("Mi");

        for (Teacher teacher : teachers) {
            if (teacher.name.startsWith(str)){
                result.add(teacher);
            }
        }

        return result;
    }




}
