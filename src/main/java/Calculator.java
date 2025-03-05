public class Calculator {
    private double litersPerKm = 5.0;
    private double fuelNeeded;
    private double fuelCost;

    public double calculateFuelConsumption(double km, double fuelPricePerLiter) {
        fuelNeeded = km * litersPerKm;
        fuelCost = fuelNeeded * fuelPricePerLiter;
        return fuelCost;
    }

    public void setLitersPerKm(double litersPerKm) {
        this.litersPerKm = litersPerKm;
    }

    public double getLitersPerKm() {
        return litersPerKm;
    }

    public double getFuelNeeded() {
        return fuelNeeded;
    }

    public double getFuelCost() {
        return fuelCost;
    }
}
