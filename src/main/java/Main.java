public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double km = 100;
        double fuelPricePerLiter = 2.5;
        double fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        System.out.println("Fuel cost for " + km + " km: " + fuelCost);
        calculator.setLitersPerKm(6.0);
        fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        System.out.println("Fuel cost for " + km + " km: " + fuelCost);
    }
}
