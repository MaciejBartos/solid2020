package pl.zzpj2020.solid.dip.weathertracker.solution;


public class WeatherTracker {

    private String currentConditions;
    private WeatherAlertable device;

    public WeatherTracker(WeatherAlertable device) {
        this.device = device;
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        String alert = device.generateWeatherAlert(weatherDescription);
        System.out.print(alert);

    }
}
