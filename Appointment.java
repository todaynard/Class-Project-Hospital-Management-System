class Appointment extends MedicalService {

    private String date;

    public Appointment(String date) {
        this.date = date;
    }

    @Override
    public void provideService() {
        System.out.println("Appointment scheduled on: " + date);
    }
}
