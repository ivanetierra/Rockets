package rockets;

import java.util.ArrayList;
import java.util.List;

public class Rocket{

    String id;
    List<Propeller> propellers = new ArrayList<>();

    public Rocket(String id, List propellers) {

        this.id = id;
        this.propellers = propellers;
    }

    public String getInfo() {

        String text = "";

        for (Propeller i : propellers) {  //for para recoger todos los propulsores (max power)
            text += i.getMaxPower() + ", ";
        }
        return "ROCKET ID: ["+id+"] PROPELLERS: ["+text+"]";
    }

    public void speedUp() {

        System.out.println("Start speeding up rocket "+ id+"!"+"\n");

        /*for (Propeller i : propellers) {

            i.run();
        }*/

        (propellers.get(0)).start();
        (propellers.get(1)).start();
        (propellers.get(2)).start();
    }
}


