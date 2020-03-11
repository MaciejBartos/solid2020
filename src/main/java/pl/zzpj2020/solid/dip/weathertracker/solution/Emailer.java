package pl.zzpj2020.solid.dip.weathertracker.solution;


public class Emailer implements WeatherAlertable{
    public String generateWeatherAlert(String weatherConditions) {
        String alert = "It is " + weatherConditions;
        return alert;
    }
}
