import java.util.*;


public class Employee{
    String ename,esal,eid;
    Scanner in = new Scanner(System.in);

    void read()
    {
        System.out.println("Enter the Employee ID, Name, Sallary: ");
        eid = in.next();
        ename = in.next();
        esal = in.next();
    }
    void display()
    {
        System.out.println("Employee details are: "+eid+"  "+ename+"  "+esal+"  ");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of employees: ");
        int n = in.nextInt();

        Employee e[] = new Employee[n];

        for(int i=0;i<n;i++)
        {
            e[i] = new Employee();
            e[i].read();
        }

        System.out.println("-----Employee details-----");
        for(int i=1;i<=n;i++)
        {
            System.out.println("Employee "+i+" details ");
            e[i].display();
        }
    }

}