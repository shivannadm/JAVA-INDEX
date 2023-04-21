//overload
import java.util.*;

class Vehicle{
    String Brand , Price;
    Scanner in = new Scanner(System.in);

    void read()
    {
        System.out.println("Enter the Vehicle brand and price: ");
        Brand = in.next();
        Price = in.next();
    }

    void display()
    {
        System.out.println("Vehicle details are: "+Brand+"  "+Price);
    }
}

    class Car extends Vehicle{
        Scanner in = new Scanner(System.in);
        String modelName,color;
        void read()
        {
            super.read();
            System.out.println("Enter the model name and color: ");
            modelName = in.next();
            color = in.next();
        }
        void display()
        {
            super.display();
            System.out.println("Car madel and color is: "+modelName+"  "+color);
        }
    }


public class Vehicleinfo{
    public static void main(String[] args) {
        Car ob = new Car();
        ob.read();
        ob.display();
    }
}
