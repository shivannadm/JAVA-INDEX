package timeconversion;   //It's only for crating package , The main function is uploaded once check it . File name is Conversios.java

import java.util.Scanner;

public class Time
{
    int hours, seconds, minutes;
    Scanner in = new Scanner(System.in);

    public void hourstominutes()
    {
        System.out.println("Enter the no of Hours to convert into minutes ");
        hours = in.nextInt();
        minutes = (hours * 60);
        System.out.println("Minutes: " + minutes);
    }

    public void minutestohours()
    {
        System.out.println("Enter the no of Minutes to convert into Hours ");
        minutes = in.nextInt();
        hours = minutes / 60;
        System.out.println("Hours: " + hours);
    }

    public void hourstoseconds() 
    {
        System.out.println("Enter the no of Hours to convert into Seconds ");
        hours = in.nextInt();
        seconds = (hours * 3600);
        System.out.println("Seconds: " + seconds);
    }

    public void secondstohours()
    {
        System.out.println("Enter the no of Seconds to convert into Hours ");
        seconds = in.nextInt();
        hours = seconds / 3600;
        System.out.println(seconds + "seconds" + " is equal to " + hours + "hour");
    }
}
