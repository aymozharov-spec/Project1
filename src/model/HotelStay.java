package model;
/*
import java.math.BigDecimal;

public class HotelStay {
    int stars;
    int nights;
    RoomType roomType;

    @Override
    public BigDecimal CalculateTotalPrice(int participants){
        return  getPrice()
                .multiply(BigDecimal.valueOf(participants))
                .multiply(getStarMultiplier())
                .multiply(getNightMultiplier());
    }

    private BigDecimal getStarMultiplier(){
        return switch (stars) {
            case 0 -> new BigDecimal("1.0");
            case 1 -> new BigDecimal("1.1");
            case 2 -> new BigDecimal("1.2");
            case 3 -> new BigDecimal("1.4");
            case 4 -> new BigDecimal("1.6");
            case 5 -> new BigDecimal("1.8");
            default -> BigDecimal.ZERO;
        }
    }

    private BigDecimal getNightMultiplier(){
        return switch (nights) {
        case 1 -> new BigDecimal("1.2");
        case 2 -> new BigDecimal("1.4");
        case 3 -> new BigDecimal("1.6");
            default -> new BigDecimal("2.0")
        }
    }
/*
    @Override
    public BigDecimal CalculateTotalPrice(int participants){
        var newPC = getPrice().multiply(BigDecimal.valueOf(participants));
        double hadN;
        double starsMult = 1 + ((double) stars / 10);
        boolean hadStar = stars != 0;
        hadN = switch (nights){
            case 0 -> 1;
            case 1 -> 1.2;
            case 2 -> 1.4;
            case 3 -> 1.6;
            case 4 -> 1.8;
            default -> 2;
        };

    */



    /*
    @Override
    public BigDecimal CalculateTotalPrice(int participants){
        return getPrice()
                .multiply(BigDecimal.valueOf(participants))
                .multiply(getStarMultiplier())
                .multiply(getNightMultiplier())


        double hadN;
        double stars;
        return hadStar?newPr.multiply(new BigDecimal(hadN)).multiply(new BigDecimal(starsMult))
    }
}*/

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class HotelStay extends Tour_Service {
    private int stars;
    private int nights;
    private RoomType roomType;

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public BigDecimal calculateTotalPrice(int participants) {
        return getPrice()
                .multiply(BigDecimal.valueOf(participants))
                .multiply(getStarMultiplier())
                .multiply(getNightMultiplier());
    }

    private BigDecimal getStarMultiplier() {
        return switch (stars) {
            case 0 -> new BigDecimal("1.0");
            case 1 -> new BigDecimal("1.1");
            case 2 -> new BigDecimal("1.2");
            case 3 -> new BigDecimal("1.4");
            case 4 -> new BigDecimal("1.6");
            case 5 -> new BigDecimal("1.8");
            default -> BigDecimal.ZERO;
        };
    }

    private BigDecimal getNightMultiplier() {
        return switch (nights) {
            case 1 -> new BigDecimal("1.2");
            case 2 -> new BigDecimal("1.4");
            case 3 -> new BigDecimal("1.6");
            default -> new BigDecimal("2.0");
        };
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "HotelStay{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", price=" + (getPrice() != null ? df.format(getPrice()) : "null") +
                ", from=" + getFrom() +
                ", to=" + getTo() +
                ", stars=" + stars +
                ", nights=" + nights +
                ", roomType=" + (roomType != null ? roomType.name() : "null") +
                '}';
    }
}
