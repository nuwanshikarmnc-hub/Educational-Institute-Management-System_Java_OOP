class MidExam extends Exam {
    private String hallNumber;

    public MidExam(String subjectCode, String date, String instructorName, String hallNumber) {
        super(subjectCode, date, instructorName);
        this.hallNumber = hallNumber;
    }

    @Override
    public String toString() {
        return String.format("Mid Exam for %s on %s in Hall %s by %s", subjectCode, date, hallNumber, instructorName);
    }

    @Override
    public void conductExam() {
        System.out.println(this);
    }
}