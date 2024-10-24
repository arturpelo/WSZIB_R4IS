package obserwator;

public class PracownikAlicja implements Observer {

    private double temperature;

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void update(double temperature){
        System.out.println("Pracownik Alicja zgłasza zmiane temperatury na "+temperature+" st. C");
        setTemperature(temperature);
    };
    public void testTemp(double temperature){
        if(this.temperature!=temperature) System.out.println("Alarm ");
    }
}
