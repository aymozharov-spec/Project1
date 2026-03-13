package model;

import java.math.BigDecimal;
/*
public class Flight extends Tour_Service {
    String origin;
    String destination;
    String flightNumber;
    boolean baggageInclude;

    @Override
    public BigDecimal CalculateTotalPrice(int participants){
        var totalPrice = getPrice().multiply(BigDecimal.valueOf(participants));
        return baggageInclude ? totalPrice.multiply(new BigDecimal("1.3")) : totalPrice;
    }
}
*/
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Flight extends Tour_Service {
    private String origin;
    private String destination;
    private String flightNumber;
    private boolean baggageInclude;

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public boolean isBaggageInclude() {
        return baggageInclude;
    }

    public void setBaggageInclude(boolean baggageInclude) {
        this.baggageInclude = baggageInclude;
    }

    @Override
    public BigDecimal calculateTotalPrice(int participants) {
        BigDecimal totalPrice = getPrice().multiply(BigDecimal.valueOf(participants));
        return baggageInclude ? totalPrice.multiply(new BigDecimal("1.3")) : totalPrice;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "Flight{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + (getPrice() != null ? df.format(getPrice()) : "null") +
                ", from=" + getFrom() +
                ", to=" + getTo() +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                ", baggageInclude=" + baggageInclude +
                '}';
    }
}