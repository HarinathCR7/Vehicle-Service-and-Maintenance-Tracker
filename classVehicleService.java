import java.util.Scanner;
public class VehicleService {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Owner Name: ");
        String owner = sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNo = sc.nextLine();

        System.out.print("Enter Last Service Date (YYYY-MM-DD): ");
        String serviceDate = sc.nextLine();

        System.out.print("Enter Service Description: ");
        String description = sc.nextLine();

        System.out.print("Enter Service Cost: ");
        double cost = sc.nextDouble();

        System.out.println("\n--- Vehicle Service Details ---");
        System.out.println("Owner: " + owner);
        System.out.println("Vehicle Number: " + vehicleNo);
        System.out.println("Last Service Date: " + serviceDate);
        System.out.println("Service Description: " + description);
        System.out.println("Cost: " + cost);

        sc.close();
    }
}
