package obserwator;

public class PracownikAdam implements Observer {
    @Override
    public void update(double temperature){
        System.out.println("Pracownik Adam zgłasza zmiane temperatury na "+temperature+" st. C");
    };
}
