package obserwator;

import java.util.ArrayList;
import java.util.List;


public class Thermometer {

            private double temperature;
            private List<Observer> observers = new ArrayList<>();

            public void addObserver(Observer observer){
                observers.add(observer);

            };

            public void removeObserver(Observer observer){
                observers.remove(observer);
            }

            private void notifyObservers(){
                for(Observer observer : observers){
                    observer.update(temperature);
                }
            }
            public void setTemperature(double temperature){
                this.temperature = temperature;
                notifyObservers();

            }

}
