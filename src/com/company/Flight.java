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

   //getter setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }
    public void setBookedSeats(int bookedSeats){
        this.bookedSeats=bookedSeats;
    }

    //action methods

    public String getFlightDetails(){
        String s = getFlightNumber()+"\n"+ getAirline() + "\n"+getBookedSeats()+"\n"+getCapacity();
        return s;
    }
    public boolean checkAvaialability(){
        return getBookedSeats() < getCapacity();
    }
    public void incrementBookingCounter(){
        int count1= getBookedSeats();
        count1++;
        setBookedSeats(count1);
    }

}
