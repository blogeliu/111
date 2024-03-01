import java.time.LocalDate;

public class Wedding {
    private Couple couple;
    private LocalDate weddingDate;
    private String location;

    public Wedding(Couple couple, LocalDate weddingDate, String location) {
        this.couple = couple;
        this.weddingDate = weddingDate;
        this.location = location;
    }

    public Couple getCouple() {
        return couple;
    }

    // Getter method for the wedding date
    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public String getLocation() {
        return location;
    }
}
