package eu.app;

import eu.example.One;
import eu.example.Two;

public class App {

    public String twoGreetings(){
        One one = new One();
        Two two = new Two();
        return one.sayHello() + " " + two.sayHello();
    }
}
