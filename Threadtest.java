EXP.NO:10A
DATE:15/09/2026
                    Creating Simple Thread

Aim:
To write a Java program to demonstrate multithreading using `yield()`, `sleep()` and `start()` methods.

Algorithm:
1. Start the program and create three thread classes A, B and C.
2. Override the `run()` method in each thread.
3. Use `Thread.yield()` to allow other threads to execute.
4. Use `Thread.sleep(1500)` to pause thread C for 1.5 seconds.
5. Use the `break` statement to terminate thread B after printing 3.
6. Create thread objects and start all threads using the `start()` method.

Source Code:
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}

class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}

class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}

public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

Output:
Start thread A
exit from main thread
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
thread C = 2
thread C = 3
thread C = 4
thread C = 5

Result:
Thus, the Java program to demonstrate multithreading using `yield()`, `sleep()` and `start()` methods was executed successfully.
