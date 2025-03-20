import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Calculator {
    private double litersPerKm = 0.33;
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Select a language");
        System.out.println("1. Farsi");
        System.out.println("2. Finnish");
        System.out.println("3. Japanese");

        Locale locale = Locale.getDefault();

        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                locale = new Locale("fa", "IR");
                break;
            case 2:
                locale = new Locale("fi", "FI");
                break;
            case 3:
                locale = new Locale("ja", "JP");
                break;
            default:
                System.out.println("Invalid choice. Defaulting to English (US)");
                locale = new Locale("en", "US");
                break;
        }

        ResourceBundle rb;
        try {
            rb = ResourceBundle.getBundle("messages", locale);
        } catch (Exception e) {
            System.out.println("Invalid locale. Defaulting to English (US)");
            rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }

        System.out.println(rb.getString("kilo"));
        double kilo = sc.nextDouble();

        System.out.println(rb.getString("price"));
        double price = sc.nextDouble();

        double cost = calculator.calculateFuelConsumption(kilo, price);
        System.out.println(rb.getString("total") + cost);
    }
}
