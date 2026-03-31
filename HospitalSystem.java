import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class HospitalSystem {

    static ArrayList<Patient> patients = new ArrayList<>();
    static final String FILE_NAME = "patients.txt";

    public static void main(String[] args) {
        loadPatients(); // load from file

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter Name: ");
                String name = scanner.nextLine();

                System.out.print("Enter Age: ");
                int age = scanner.nextInt();

                patients.add(new Patient(id, name, age));
                savePatients();

                System.out.println("Patient added!");
            }

            else if (choice == 2) {
                for (Patient p : patients) {
                    System.out.println(p);
                }
            }

            else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }
        }
    }

    // SAVE DATA
    public static void savePatients() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Patient p : patients) {
                writer.write(p.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }

    // LOAD DATA
    public static void loadPatients() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);

                patients.add(new Patient(id, name, age));
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }
    }
}
