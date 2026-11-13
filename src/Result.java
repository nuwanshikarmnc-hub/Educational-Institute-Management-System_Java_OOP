class Result implements Displayable {
    private double attendancePercentage;
    private double labMarks;
    private double finalExamMarks;

    public Result(double attendancePercentage, double labMarks, double finalExamMarks) {
        if (attendancePercentage < 0 || attendancePercentage > 100 || labMarks < 0 || labMarks > 50
                || finalExamMarks < 0 || finalExamMarks > 100) {
            throw new IllegalArgumentException("Invalid input for Result details.");
        }
        this.attendancePercentage = attendancePercentage;
        this.labMarks = labMarks;
        this.finalExamMarks = finalExamMarks;
    }

    @Override
    public String toString() {
        double totalMarks = labMarks + finalExamMarks;
        double gpa = totalMarks / 15;
        String grade = gpa >= 8 ? "A+" : gpa >= 6 ? "A" : gpa >= 4 ? "B" : "C";

        return String.format("Results Summary:\nAttendance: %.2f%%\nLab Marks: %.2f\nFinal Exam Marks: %.2f\nTotal Marks: %.2f\nGPA: %.2f\nGrade: %s",
                attendancePercentage, labMarks, finalExamMarks, totalMarks, gpa, grade);
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
