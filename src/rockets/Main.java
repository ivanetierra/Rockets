package rockets;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //create propellers for rocket1
        List<Propeller> propellers1 = new ArrayList<>();
        propellers1.add(new Propeller(10));
        propellers1.add(new Propeller(30));
        propellers1.add(new Propeller(80));

        Rocket rocket1 = new Rocket("32WESSDS", propellers1); //create rocket1


        //create propellers for rocket2
        List<Propeller> propellers2 = new ArrayList<>();
        propellers2.add(new Propeller(30));
        propellers2.add(new Propeller(40));
        propellers2.add(new Propeller(50));
        propellers2.add(new Propeller(50));
        propellers2.add(new Propeller(30));
        propellers2.add(new Propeller(10));


        Rocket rocket2 = new Rocket("LDSFJA32", propellers2); //create rocket2


        System.out.println(rocket1.getInfo()+"\n");
        rocket1.speedUp();
        

        //System.out.println(rocket2.getInfo()+"\n");
        //rocket2.speedUp();


    }

}
