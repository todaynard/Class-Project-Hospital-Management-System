class Patient extends Person implements Billable {

    private String illness;

    public Patient(String name, int age, String illness) {
        super(name, age);
        this.illness = illness;
    }

    @Override
    public void displayRole() {
        System.out.println("Patient: " + getName());
    }

    @Override
    public double calculateBill() {
        return 2000;
    }

    public void showDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Illness: " + illness);
    }
}
