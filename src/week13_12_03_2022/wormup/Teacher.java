package week13_12_03_2022.wormup;

import java.time.LocalDate;

public class Teacher {
    public String name, lastName;
    public char gender;
    public LocalDate dateOfBirth;
    public int age, id;

    public Teacher(String name, String lastName, char gender, LocalDate dateOfBirth, int id) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        // date of birth
        int currentYear = LocalDate.now().getYear();
        int yearOfDateOfBirth = dateOfBirth.getYear();
        this.age = currentYear - yearOfDateOfBirth;
        this.id = id;
    }


    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
