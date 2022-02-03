package com.company;

public class TouristTicket extends Ticket{
    public TouristTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price){
        super( pnr,  from,  to,  departureDateTime,  arrivalDateTime,  seatNo,  passenger,  cancelled,  price);
    }
    public String hotelAddress;
    public String[] selectedTouristLocation;

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }
    public void addTouristLocations(String location){}
    public void removeTouristLocations(String location){}

}
