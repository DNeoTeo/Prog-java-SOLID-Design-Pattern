package exercice4;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private double temperature;
    private double pressure;
    private double humidity;

    @Override
    public void registerObserver(Observer o){
            observers.add(o);
    }
    @Override
    public void removeObserver(Observer o){
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
    @Override
    public void notifyObservers(){
        System.out.println("notify observers");
    }
    public void setTemperature(double t){
        this.temperature = t;
        measurementChanged();
    }
    public void setPressure(double p){
        this.pressure = p;
        measurementChanged();
    }
    public void setHumidity(double h){
        this.humidity = h;
        measurementChanged();
    }
    public void measurementChanged(){
        notifyObservers();
        for (Observer elem:observers) {
            elem.update(this.temperature, this.pressure, this.humidity);
        }
    }
}
