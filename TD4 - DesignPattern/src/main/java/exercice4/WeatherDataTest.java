package exercice4;

public class WeatherDataTest {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        Observer ccd = new CurrentConditionsDisplay();
        Observer ccd1 = new StatisticsDisplay();
        wd.registerObserver(ccd);
        wd.registerObserver(ccd1);
        wd.setTemperature(10.0);
        wd.setPressure(1000.0);
        wd.setHumidity(80.0);
        wd.setTemperature(12.0);
        wd.setPressure(1020.0);
        wd.setHumidity(60.0);
    }
}