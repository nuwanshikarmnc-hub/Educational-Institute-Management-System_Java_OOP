class Person implements Displayable {
    protected String name;
    protected String gender;

    public Person(String name, String gender) {
        if (name.isEmpty() || (!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female"))) {
            throw new IllegalArgumentException("Invalid input for Person details.");
        }
        this.name = name;
        this.gender = gender;
    }

    @Override
    public void displayDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nGender: %s", name, gender);
    }
}