EXP.NO:07
DATE:18/08/2026
                Interface Program

Aim:
To write a Java program to demonstrate the implementation of an interface using the `Animal` interface.

Algorithm:
1. Start the program.
2. Create an interface named `Animal` with a method `sound()`.
3. Create a class `Dog` that implements the `Animal` interface.
4. Define the `sound()` method to display "Dog Barks".
5. Create an object of the `Dog` class and call the `sound()` method.
    
Source Code:    
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog Barks");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

Output:
Dog Barks

Result:
Thus, the Java program to demonstrate the implementation of an interface was executed successfully.
