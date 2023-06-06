// Multi thread in jaava

class Hello extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
        System.out.println("Hello");
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        }
    }
}

class World extends Thread{
    public void run()
    {
        for(int i=1;i<5;i++){
        System.out.println("World");
        try
        {
            Thread.sleep(1000);
        }catch(InterruptedException e){}
        }
    }
}

public class Multithread {
    public static void main(String[] args) {
        Hello ob = new Hello();
        World ob1 = new World();
        ob.start();
        ob1.start();
    }
}
   
