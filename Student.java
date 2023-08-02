
//java

import java.util.Scanner;

public class Student {
    String USN, Name, Phone, Branch;
    Scanner input = new Scanner(System.in);

    void read() {
        System.out.println("Enter USN: ");
        USN = input.next();
        System.out.println("Enter Name: ");
        Name = input.next();
        System.out.println("Enter Branch: ");
        Branch = input.next();
        System.out.println("Enter Phone: ");
        Phone = input.next();
    }

    void display() {
        System.out.println(USN + "\t\t" + Name + "\t\t" + Branch + "\t\t" + Phone);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = input.nextInt();
        Student s[] = new Student[n];
        for (int i = 0; i < n; i++) {
            s[i] = new Student();
            s[i].read();
        }
        System.out.println("Student details are as fallow :");
        System.out.println("USN" + "\t\t" + "Name" + "\t\t" + "Branch" + "\t\t" + "Phone");
        for (int i = 0; i < n; i++) {
            s[i].display();
        }

    }
}

