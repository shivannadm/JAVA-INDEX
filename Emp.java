import java.util.Scanner;

public class Emp{
        int eid;
        String name;
        String edept;
        float salary;

        Emp()
        {
            System.out.println("Default constractor ");
        }

        Emp(int eId,String ename,String edep,float esal)
        {

            eid = eId;
            name    = ename;
            edept = edep;
            salary = esal;
        }
    public static void main(String[] args) {
        Emp e1 = new Emp();
        System.out.println("Employee details are "+e1.eid+" "+e1.name+" "+e1.edept+" "+e1.salary);
        Emp e2 = new Emp(101,"abc","xuz",1255);
        System.out.println("Employee details are "+e2.eid+" "+e2.name+" "+e2.edept+" "+e2.salary);
    }
}