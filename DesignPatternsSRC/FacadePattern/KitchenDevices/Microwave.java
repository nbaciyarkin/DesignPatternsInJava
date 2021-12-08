package FacadePattern.KitchenDevices;

public class Microwave {
    private String heat;
    private String temperature;
    private String time;


    public Microwave(String heat, String temperature, String time, ElectricGrill electricGrill) {
        this.heat = heat;
        this.temperature = temperature;
        this.time = time;
    }

    public String getHeat() {
        return heat;
    }

    public void setHeat(String heat) {
        this.heat = heat;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void turnMicrowave(){
        System.out.println("Turning on Microwave");
    }

    public void measurementsMicrowave (){
        System.out.println("Microwave on " + this.heat +","+ "Temperature"+ this.temperature +", Time" + this.time);
    }
    public void turningOff(){
        System.out.println("Turning Off Microwave");
    }


}
