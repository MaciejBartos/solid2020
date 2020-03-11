package pl.zzpj2020.solid.ocp.usa.solution;

public class FLSpeedLimitFine extends USASpeedLimitFine {

    private double fineMultiplier = 1.5;
    private int speedLimit = 100;
    private double basicFine = 1000.0;

    @Override
    public double calculateFine(int speed) {
        if (speed > getSpeedLimit()) {
            return getBasicFine() + ((speed - getSpeedLimit()) % 10) * fineMultiplier * 2 * Math.PI;
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
