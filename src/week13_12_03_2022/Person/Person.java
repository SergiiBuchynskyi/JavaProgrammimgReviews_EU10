package week13_12_03_2022.Person;

public class Person {

    private String firstName, lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person() {
        this.setFirstName("undefined");
        this.setLastName("undefined");
        this.setAge(-1);
    }

    public Person(String firstName, String lastName, int age) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
    }

    public String toString() {
        return firstName + '|' +
               lastName + '|' +
               age;

    }

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println(person.getFirstName()); //"undefined"
        System.out.println(person.getLastName()); //"undefined"
        System.out.println(person.getAge()); // -1
        System.out.println(person.toString()); //"undefined | undefined | -1"

        person.setFirstName("John");
        person.setLastName("Doe");
        person.setAge(44);

        System.out.println(person.toString() ); // "John | Doe | 44"

        Person person1 = new Person("Fatima", "Lee", 22);

        System.out.println(person1.getFirstName()); //"Fatima"
        System.out.println(person1.getLastName()); //"Lee"
        System.out.println(person1.getAge()); // 22
        System.out.println(person1.toString()); //"Fatima | Lee | 22"
    }


}
