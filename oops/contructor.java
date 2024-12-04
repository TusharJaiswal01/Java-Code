class Animal {
    String name;
// parameterized constructor like c++
    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Some generic animal sound");
    }
}
//inherit properties 
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog("Buddy");
        Animal myCat = new Cat("Whiskers");

        myDog.sound();
        myCat.sound();
    }
}
