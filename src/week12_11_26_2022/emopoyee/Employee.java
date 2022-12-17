package week12_11_26_2022.emopoyee;

public class Employee {

    public String name;
    public int id;
    public char gender;

    public Employee(String name, int id, char gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    Employee employee1 = new Employee("Adam", 6789, 'M');
    Employee employee2 = new Employee("Madam", 6239, 'F');



}
