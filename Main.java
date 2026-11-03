EXP.NO:04
DATE:11/08/2026
                Inheritence

Aim:
To write a Java program to demonstrate different types of inheritance: Single, Multilevel, Hierarchical, Multiple (using interfaces), and Hybrid inheritance.

Algorithm:
1. Start the program and create the required classes and interfaces.
2. Demonstrate single inheritance using `Animal` and `Dog` classes.
3. Demonstrate multilevel inheritance using `Animal`, `Dog`, and `Puppy` classes.
4. Demonstrate hierarchical inheritance using `Animal`, `Dog`, and `Cat` classes.
5. Demonstrate multiple inheritance using `Father` and `Mother` interfaces.
6. Demonstrate hybrid inheritance using the `Student` class and `Sports` interface.
7. Create objects and call the methods to display the results.

Source Code:
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays");
    }
}
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}
interface Father {
    void fatherProperty();
}

interface Mother {
    void motherProperty();
}

class Child implements Father, Mother {
    @Override
    public void fatherProperty() {
        System.out.println("Child gets property from Father");
    }

    @Override
    public void motherProperty() {
        System.out.println("Child gets property from Mother");
    }
}
interface Sports {
    void playSports();
}

class Student {
    void study() {
        System.out.println("Student studies");
    }
}

class CollegeStudent extends Student implements Sports {
    @Override
    public void playSports() {
        System.out.println("College student plays sports");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();

        System.out.println("\nMultiple Inheritance using Interfaces:");
        Child ch = new Child();
        ch.fatherProperty();
        ch.motherProperty();

        System.out.println("\nHybrid Inheritance:");
        CollegeStudent cs = new CollegeStudent();
        cs.study();
        cs.playSports();
    }
}

Output:
Single Inheritance:
Animal eats
Dog barks

Multilevel Inheritance:
Animal eats
Dog barks
Puppy plays

Hierarchical Inheritance:
Animal eats
Cat meows

Multiple Inheritance using Interfaces:
Child gets property from Father
Child gets property from Mother

Hybrid Inheritance:
Student studies
College student plays sports

Result:
Thus, the Java program to demonstrate different types of inheritance was executed successfully.
