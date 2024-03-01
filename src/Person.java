public class Person {
    // Fields for the person's first and last name
    private String firstName;
    private String lastName;

    // Constructor that requires an argument for each field
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter method for the first name
    public String getFirstName() {
        return firstName;
    }

    // Getter method for the last name
    public String getLastName() {
        return lastName;
    }
}
