package pl.zzpj2020.solid.lsp.vehiclemovement.violation;

public class Vehicle {

    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}