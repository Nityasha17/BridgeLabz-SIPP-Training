package OOPS_Constructors_AccessModifiers;

public class Person {
    private String name;
    private int age;

    public Person() {
        this.name = "No Name";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
