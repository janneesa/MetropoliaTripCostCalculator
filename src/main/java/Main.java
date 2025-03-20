import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        double km = 100;
        double fuelPricePerLiter = 2.5;

        double fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        System.out.println("Fuel cost for " + km + " km: " + fuelCost);

        calculator.setLitersPerKm(0.45);
        fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        System.out.println("Fuel cost for " + km + " km: " + fuelCost);

        System.out.println("Select a language");
        System.out.println("1. Farsi");
        System.out.println("2. Finnish");
        System.out.println("3. Japanese");

        int choice = sc.nextInt();
    }
}
