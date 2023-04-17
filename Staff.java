//method overloading

import java.util.Scanner;

class Staff {
    String staffid, name, phone, salary;
    Scanner input = new Scanner(System.in);

    // Method to read class variables
    void read() {
        System.out.println("Enter StaffID:");
        staffid = input.nextLine();
        System.out.println("Enter Name:");
        name = input.nextLine();
        System.out.println("Enter Phone:");
        phone = input.nextLine();
        System.out.println("Enter Salary:");
        salary = input.nextLine();
    }

    // Method to display Staff attributes/variables
    void display() {
        System.out.print("STAFFID: ");
        System.out.println(staffid);
        System.out.print("NAME: ");
        System.out.println(name);
        System.out.print("PHONE:");
        System.out.println(phone);
        System.out.print("SALARY:");
        System.out.println(salary);
    }
}

// Class Teaching inherits from Super class Staff
class Teaching extends Staff {
    String domain, publication;

    // Method to read only Teaching class variables
    @Override
    public void read() {
        super.read(); // call super class read method
        System.out.println("Enter Domain");
        domain = input.nextLine();
        System.out.println("Enter Publication");
        publication = input.nextLine();
    }

    @Override
    public void display() {
        super.display(); // call super class display() method
        System.out.print("DOMAIN:");
        System.out.println(domain);
        System.out.print("PUBLICATION:");
        System.out.println(publication);
    }
}

// Class Technical inherits from parent Staff
class Technical extends Staff {
    String skills;

    void read() {
        super.read(); // call super class read method
        System.out.println("Enter Skills");
        skills = input.nextLine();
    }

    void display() {
        super.display(); // call super class display() method
        System.out.print("SKILLS:");
        System.out.println(skills);
    }
}

// Class Contract inherits from parent Staff
class Contract extends Staff {
    String period;

    void read() {
        super.read(); // call super class read method
        System.out.println("Enter Period");
        period = input.nextLine();
    }

    void display() {
        super.display(); // call super class display() method
        System.out.print("PERIOD:");
        System.out.println(period);
    }
}

class Staffdetails {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of staff details to be created");
        int n = input.nextInt();
        // Declaring array of objects
        Teaching ts[] = new Teaching[n];
        Technical tech[] = new Technical[n];
        Contract c[] = new Contract[n];
        // Read Staff information under 3 categories
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Teaching staff information");
            // instantiating the objects of Teaching class
            ts[i] = new Teaching();
            ts[i].read();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Technical staff information");
            tech[i] = new Technical();
            tech[i].read();

        }
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Contract staff information");
            c[i] = new Contract();
            c[i].read();
        }
        // Display Staff Information
        System.out.println("\n STAFF DETAILS: \n");
        System.out.println("-----TEACHING STAFF DETAILS----- ");
        for (int i = 0; i < n; i++) {
            ts[i].display();
        }
        System.out.println("-----TECHNICAL STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            tech[i].display();
        }

        System.out.println("-----CONTRACT STAFF DETAILS-----");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }
    }
}
