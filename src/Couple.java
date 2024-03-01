
public class Couple {
    // Fields for the bride and groom, which are Person objects
    private Person bride;
    private Person groom;

    // Constructor that requires two Person objects
    public Couple(Person bride, Person groom) {
        this.bride = bride;
        this.groom = groom;
    }

    // Getter method for the bride
    public Person getBride() {
        return bride;
    }

    // Getter method for the groom
    public Person getGroom() {
        return groom;
    }
}
