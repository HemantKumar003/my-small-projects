import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TARIFF_RATE = 7.5;

        System.out.print("Enter the number of units consumed: ");
        int unitsConsumed = scanner.nextInt();

        double billAmount = unitsConsumed * TARIFF_RATE;

        System.out.println("Electricity Bill Calculator");
        System.out.println("===========================");
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Tariff Rate per unit: $" + TARIFF_RATE);
        System.out.println("Total Bill Amount: $" + billAmount);

        scanner.close();
    }
}
