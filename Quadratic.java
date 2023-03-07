import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        double a, b, c, d, r1, r2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        a = sc.nextDouble();
        System.out.println("Enter the value for b: ");
        b = sc.nextDouble();
        System.out.println("Enter the value for c: ");
        c = sc.nextDouble();
        d = b * b - 4 * a * c;
        if (a == 0) {
            System.out.println("Invalid coefficient");
        } else if (d > 0.0) {
            System.out.println("The roots are real and distinct");
            r1 = (-b + (Math.sqrt(d))) / (2.0 * a);
            r2 = (-b - (Math.sqrt(d))) / (2.0 * a);
            System.out.println("r1 = " + r1 + "and r2 = " + r2);
        } else if (d == 0.0) {
            System.out.println("The roots are real and equal");
            r1 = -b / (2.0 * a);
            System.out.println("r1 = " + r1);
        } else {
            System.out.println("The roots are complex and imaginary");
            r1 = -b / (2.0 * a);
            r2 = (Math.sqrt(Math.abs(d))) / (2.0 / a);
            System.out.println("r1 = " + r1 + "+i" + r2 + "\nr2=" + r1 + "-i" + r2);
        }

    }

}
