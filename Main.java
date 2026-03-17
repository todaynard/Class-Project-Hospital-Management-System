public class Main {
    public static void main(String[] args) {

        Doctor doctor = new Doctor("Dr. Smith", 45, "Cardiology");
        Patient patient = new Patient("John", 30, "Flu");
        Appointment appointment = new Appointment("20 March 2026");

        System.out.println("\n--- Doctor Details ---");
        doctor.showDetails();
        doctor.displayRole();
        doctor.scheduleAppointment();

        System.out.println("\n--- Patient Details ---");
        patient.showDetails();
        patient.displayRole();
        System.out.println("Bill: KES " + patient.calculateBill());

        System.out.println("\n--- Appointment ---");
        appointment.provideService();
    }
}
