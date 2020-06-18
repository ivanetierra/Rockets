package rockets;

public class Propeller extends Thread{

    int currentPower = 0;
    int maxPower;

    public Propeller(int maxPower) {

        this.maxPower = maxPower;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setCurrentPower(int currentPower) {
        this.currentPower = currentPower;
    }

    public String GetCurrentPower() {
        return "[Current: " + currentPower + " Max: " + maxPower + "]";
    }

    public void run() {

        while (currentPower < maxPower) {

            currentPower += 10;
            System.out.println(GetCurrentPower() + " " + getName());

            if (currentPower == maxPower) {
                System.out.println("Propeller '"+getName()+"' has its Max Power reached.");
            }
            try {
                Thread.sleep((1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }



        }
    }
}
