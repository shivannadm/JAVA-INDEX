
//package building

import currencyconversion.*; //You need to creat one package for currence conversion , which I uploaded the file name is Currency.jav 
import distanceconversion.*;  //You need to creat package for currence conversion , which I uploaded the file name is Distance.java
import timeconversion.*;  //You need to creat package for currence conversion , which I uploaded the file name is Time.java

public class Conversions {
    public static void main(String args[]) {
        Currency obj = new Currency();
        Distance obj1 = new Distance();
        Time obj2 = new Time();
        obj.dollartorupee();
        obj.rupeetodollar();
        obj.eurotorupee();
        obj.rupeetoeuro();
        obj.yentoruppe();
        obj.ruppetoyen();
        obj1.mtokm();
        obj1.kmtom();
        obj1.milestokm();
        obj1.kmtomiles();
        obj2.hourstominutes();
        obj2.minutestohours();
        obj2.hourstoseconds();
        obj2.secondstohours();
    }
}

