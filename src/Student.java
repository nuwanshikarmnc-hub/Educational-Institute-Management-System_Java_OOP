class Student extends Person {
    private String studentID;
    private String department;
    private int academicYear;

    public Student(String name, String gender, String studentID, String department, int academicYear) {
        super(name, gender);
        if (studentID.isEmpty() || (!department.equals("PS") && !department.equals("BECS"))
                || academicYear < 1 || academicYear > 4) {
            throw new IllegalArgumentException("Invalid input for Student details.");
        }
        this.studentID = studentID;
        this.department = department;
        this.academicYear = academicYear;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nStudent ID: %s\nDepartment: %s\nAcademic Year: %d", studentID, department, academicYear);
    }
}
