// Abstract (java OOPs)

package Abstract; //package (Directory name)


//Parent class (Abstract class)
abstract class Car{
    public abstract void drive();
    public abstract void fly();

    public void musicPlay(){
        System.out.println("Music Playing...");
    }
    
}

//Child Abstract class to car (Inherited)
abstract class WagonR extends Car{
    public void drive(){
        System.out.println("Driving...");
    }
    
}

//Normal Class for accessing the all methods(abstract and normal class methods)
//In java we can't create object for abstract class so create one normal class which extends the abstract classes 

class UpdatedWagonR extends WagonR{
    public void fly(){
        System.out.println("Flying...");
    }
}


//Main Class
public class Main {
    public static void main(String[] args) {
        Car obj = new UpdatedWagonR();
        obj.drive();
        obj.musicPlay();
        obj.fly();

    }
}
