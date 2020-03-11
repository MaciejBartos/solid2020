package pl.zzpj2020.solid.ocp.usa.solution;

public class ALSpeedLimitFine extends USASpeedLimitFine {

    private double fineMultiplier = 2.1;
    private int speedLimit = 100;
    private double basicFine = 500.0;

    @Override
    public double calculateFine(int speed) {
        if (speed > getSpeedLimit()) {
            return getBasicFine() + (speed - getSpeedLimit())*getFineMultiplier();
        }

        return 0.0;
    }

    public double getFineMultiplier() {
        return fineMultiplier;
    }

    public void setFineMultiplier(double fineMultiplier) {
        this.fineMultiplier = fineMultiplier;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public double getBasicFine() {
        return basicFine;
    }

    public void setBasicFine(double basicFine) {
        this.basicFine = basicFine;
    }
}
