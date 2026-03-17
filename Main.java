import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Doctor Name: ");
            String dName = scanner.nextLine();

            System.out.print("Enter Doctor Age: ");
            int dAge = scanner.nextInt();
            scanner.nextLine(); // clear buffer

            System.out.print("Enter Specialization: ");
            String spec = scanner.nextLine();

            Doctor doctor = new Doctor(dName, dAge, spec);

            System.out.print("Enter Patient Name: ");
            String pName = scanner.nextLine();

            System.out.print("Enter Patient Age: ");
            int pAge = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Illness: ");
            String illness = scanner.nextLine();

            Patient patient = new Patient(pName, pAge, illness);

            System.out.print("Enter Appointment Date: ");
            String date = scanner.nextLine();

            Appointment appointment = new Appointment(date);

            // Output
            System.out.println("\n--- Doctor ---");
            doctor.showDetails();

            System.out.println("\n--- Patient ---");
            patient.showDetails();
            System.out.println("Bill: KES " + patient.calculateBill());

            System.out.println("\n--- Appointment ---");
            appointment.provideService();

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter correct data type.");
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            scanner.close();
            System.out.println("\nProgram ended safely.");
        }
    }
}
