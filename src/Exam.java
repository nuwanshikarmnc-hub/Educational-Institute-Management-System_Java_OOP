abstract class Exam implements ExamConductable {
    protected String subjectCode;
    protected String date;
    protected String instructorName;

    public Exam(String subjectCode, String date, String instructorName) {
        this.subjectCode = subjectCode;
        this.date = date;
        this.instructorName = instructorName;
    }
}
