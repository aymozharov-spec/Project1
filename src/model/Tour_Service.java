package model;

/*import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

public abstract class Tour_Service {
    private Integer id;
    private String name;
    private BigDecimal price;
    private LocalDate from;
    private LocalDate to;

    public boolean isAvailableOn(LocalDate date){
        return !(from.isAfter(date)||from.isBefore(date));
    };

    public abstract BigDecimal CalculateTotalPrice(int participants);

}
*/
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Tour_Service {
    private Integer id;
    private String name;
    private BigDecimal price;
    private LocalDate from;
    private LocalDate to;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getFrom() {
        return from;
    }

    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }

    public void setTo(LocalDate to) {
        this.to = to;
    }

    public boolean isAvailableOn(LocalDate date) {
        return !(from.isAfter(date) || to.isBefore(date));
    }

    public abstract BigDecimal calculateTotalPrice(int participants);

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return "Tour_Service{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", from=" + (from != null ? from.format(formatter) : "null") +
                ", to=" + (to != null ? to.format(formatter) : "null") +
                '}';
    }
}