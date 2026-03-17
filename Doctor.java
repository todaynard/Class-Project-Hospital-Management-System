class Doctor extends Person implements Schedulable {

    private String specialization;

    public Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void displayRole() {
        System.out.println("Doctor: " + getName());
    }

    @Override
    public void scheduleAppointment() {
        System.out.println("Doctor is scheduling an appointment.");
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Specialization: " + specialization);
    }
}
