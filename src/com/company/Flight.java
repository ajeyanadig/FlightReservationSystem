package com.company;

public class Flight {
    public String flightNumber;
    public String airline;
    public int capacity;
    private int bookedSeats;
    public Flight( String flightNumber, String airline, int capacity, int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.setBookedSeats(bookedSeats);

    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails(){ return "";}
    public boolean checkAvaialability(){return true;}
    public void incrementBookingCounter(){}

}
