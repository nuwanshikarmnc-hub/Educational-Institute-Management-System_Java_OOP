class Course implements Displayable {
    private String courseName;
    private String courseCode;
    private String assignedLecturer;
    private int credits;
    private String courseContents;

    public Course(String courseName, String courseCode, String assignedLecturer, int credits, String courseContents) {
        if (courseName.isEmpty() || courseCode.isEmpty() || assignedLecturer.isEmpty() || credits <= 0 || courseContents.isEmpty()) {
            throw new IllegalArgumentException("Invalid input for Course details.");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.assignedLecturer = assignedLecturer;
        this.credits = credits;
        this.courseContents = courseContents;
    }

    @Override
    public String toString() {
        return String.format("Course Details:\nName: %s\nCode: %s\nLecturer: %s\nCredits: %d\nContents: %s",
                courseName, courseCode, assignedLecturer, credits, courseContents);
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}
