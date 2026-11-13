class Lecturer extends Person {
    private String lecturerID;
    private String email;
    private String office;
    private String qualifications;

    public Lecturer(String name, String gender, String lecturerID, String email, String office, String qualifications) {
        super(name, gender);
        if (lecturerID.isEmpty() || !email.contains("@") || office.isEmpty() || qualifications.isEmpty()) {
            throw new IllegalArgumentException("Invalid input for Lecturer details.");
        }
        this.lecturerID = lecturerID;
        this.email = email;
        this.office = office;
        this.qualifications = qualifications;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nLecturer ID: %s\nEmail: %s\nOffice: %s\nQualifications: %s",
                lecturerID, email, office, qualifications);
    }
}
