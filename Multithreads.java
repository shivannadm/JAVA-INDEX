import java.util.Random;

class Square extends Thread {
    int x;

    Square(int n) {
        x = n;
    }

    public void run() {
        int sqr = x * x;
        System.out.print("Square of " + x + " = " + sqr + " ");
        System.out.println(getName());
    }
}

class Cube extends Thread {
    int x;

    Cube(int n) {
        x = n;
    }

    public void run() {
        int cub = x * x * x;
        System.out.print("Cube of " + x + " = " + cub + " ");
        System.out.println(getName());
    }
}

class Randnum extends Thread {
    // start() method implicitly calls the run() for the main thread.
    public void run() {
        // builtin class Random for generating random numbers.
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            int randomInteger = random.nextInt(10);
            System.out.print("Random Integer generated for " + (i + 1) + "iteration is: " + randomInteger + " ");
            System.out.println("With Main thread name:" + getName());
            Square s = new Square(randomInteger);
            s.start();
            Cube c = new Cube(randomInteger);
            c.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

public class Multithreads {
    public static void main(String[] args) {
        Randnum n = new Randnum();
        n.start();
    }

}
