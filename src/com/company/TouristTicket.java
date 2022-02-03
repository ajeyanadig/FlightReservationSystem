package com.company;

public class TouristTicket extends Ticket{


    //attributes
    private int locationCount;
    public String hotelAddress;
    public String[] selectedTouristLocation;

    public TouristTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price, String location){
        super( pnr,flight,from,to,departureDateTime,arrivalDateTime,seatNo,passenger,cancelled,price);//back to ticket
        locationCount=0;

    }
    public TouristTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price, String[] location){
        super( pnr,flight,from,to,departureDateTime,arrivalDateTime,seatNo,passenger,cancelled,price);//back to ticket
        locationCount=0;
    }

    //gettersetters
    public int getLocationCount() {
        return locationCount;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }
    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public void addTouristLocations(String location){

    }
    public void addTouristLocations(String[] location){}
    public void removeTouristLocations(String location){}

}
