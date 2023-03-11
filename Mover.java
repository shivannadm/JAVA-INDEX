public class Mover {
    void add(int a, int b) {
        System.out.println("The addition of two integers: " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("The addition of three integers: " + (a + b + c));
    }

    void add(double a, Double b) {
        System.out.println("The addition of two double values: " + (a + b));
    }

    public static void main(String[] args) {
        Mover ob = new Mover();
        ob.add(18, 22);
        ob.add(18, 22, 33);
        ob.add(18.21, 22.26);
    }

}
