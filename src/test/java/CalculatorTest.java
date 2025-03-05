import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void calculateFuelConsumption() {
        Calculator calculator = new Calculator();
        double km = 100;
        double fuelPricePerLiter = 2.5;
        double fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        assertEquals(1250.0, fuelCost);
        calculator.setLitersPerKm(6.0);
        fuelCost = calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        assertEquals(1500.0, fuelCost);
    }

    @org.junit.jupiter.api.Test
    void setLitersPerKm() {
        Calculator calculator = new Calculator();
        calculator.setLitersPerKm(6.0);
        assertEquals(6.0, calculator.getLitersPerKm());
    }

    @org.junit.jupiter.api.Test
    void getLitersPerKm() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.getLitersPerKm());
    }

    @org.junit.jupiter.api.Test
    void getFuelNeeded() {
        Calculator calculator = new Calculator();
        double km = 100;
        double fuelPricePerLiter = 2.5;
        calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        assertEquals(500.0, calculator.getFuelNeeded());
    }

    @org.junit.jupiter.api.Test
    void getFuelCost() {
        Calculator calculator = new Calculator();
        double km = 100;
        double fuelPricePerLiter = 2.5;
        calculator.calculateFuelConsumption(km, fuelPricePerLiter);
        assertEquals(1250.0, calculator.getFuelCost());
    }
}