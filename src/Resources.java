class Resources implements Displayable {
    private String specializedCourses;
    private String softwarePackages;
    private String academicSupportResources;

    public Resources(String specializedCourses, String softwarePackages, String academicSupportResources) {
        if (specializedCourses.isEmpty() || softwarePackages.isEmpty() || academicSupportResources.isEmpty()) {
            throw new IllegalArgumentException("Invalid input for Resources.");
        }
        this.specializedCourses = specializedCourses;
        this.softwarePackages = softwarePackages;
        this.academicSupportResources = academicSupportResources;
    }

    @Override
    public String toString() {
        return String.format("Resources Available:\nSpecialized Courses: %s\nSoftware Packages: %s\nAcademic Support: %s",
                specializedCourses, softwarePackages, academicSupportResources);
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }
}

