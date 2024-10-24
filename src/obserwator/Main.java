package obserwator;

public class Main {
    public static void main(String[] args) {
    Thermometer thermometer = new Thermometer();

        PracownikAdam pracownikAdam = new PracownikAdam();
        PracownikAlicja pracownikAlicja = new PracownikAlicja();

        //thermometer.setTemperature(5.5);
        thermometer.addObserver(pracownikAdam);
        //thermometer.setTemperature(10.0);

        thermometer.addObserver(pracownikAlicja);
        thermometer.addObserver(pracownikAlicja);
        thermometer.setTemperature(12.0);

        thermometer.removeObserver(pracownikAlicja);
        thermometer.removeObserver(pracownikAlicja);
        thermometer.removeObserver(pracownikAdam);

        thermometer.setTemperature(40.0);
        thermometer.addObserver(pracownikAlicja);




    }
}