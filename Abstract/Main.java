// Abstract (java OOPs)

package Abstract;

abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void musicPlay(){
        System.out.println("Music Playing...");
    }
    
}

abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
    
}

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.musicPlay();
        obj.fly();

    }
}
