class Person {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "John";
        p.age = 25;
        p.display();
    }
}