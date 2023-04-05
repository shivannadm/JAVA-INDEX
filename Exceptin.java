public class Exception {
    public static void main(String[] args) {
    int a[]={1,2,3};
    String name=null;
    try{
    System.out.println(name.length());
    }
    catch(NullPointerException e)
    {
    System.out.println(e);
    System.out.println("Name is set to null, please provide valid name:");
    }
    try
    {
    System.out.println(a[4]);
    }
    catch(Exception e)
    {
    System.out.println(e);
    }
    
    }
    
   } 
   
