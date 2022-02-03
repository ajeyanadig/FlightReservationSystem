package com.company;

public class Flight {
    //attributes
    private String flightNumber;
    private String airline;
    private int capacity;
    private int bookedSeats;

    public Flight( String flightNumber, String airline, int capacity, int bookedSeats){
        this.flightNumber=flightNumber;
        this.airline=airline;
        this.capacity=capacity;
        this.bookedSeats=bookedSeats;

    }

    //action methods

    public String getFlightDetails(){
        String s = this.flightNumber+"\n"+ this.airline + "\n"+this.bookedSeats+"\n"+this.capacity;
        return s;
    }
    public boolean checkAvaialability(){
        return (this.bookedSeats < this.capacity);
    }
    public void incrementBookingCounter(){
        this.bookedSeats++;
    }

}
