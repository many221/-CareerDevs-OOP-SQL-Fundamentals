package com.careerdevs.polymorph;

class Bird{
    public void sing(){
        System.out.println ("Tweet Tweet Tweet");
    }
}
class Robin extends Bird{
    public void sing(){
        System.out.println ("Tweedle Dee Dee");
    }
}

class Pelican extends Bird{
    public void sing(){
        System.out.println ("KWAAH KWAAH KWAAH");
    }
}
public class Polymorphism {

    public static void main(String[] args) {

        Robin b = new Robin ();

        b.sing ();
    }
}
