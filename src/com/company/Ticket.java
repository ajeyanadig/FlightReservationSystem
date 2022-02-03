package com.company;

public class Ticket {
    public String pnr;



    private String from;
    private String to;
    private String departureDateTime;
    private String arrivalDateTime;
    private String seatNo;
    private boolean cancelled;
    private float price;
    public Passenger passenger;
    public Flight flight;

    public Ticket( String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price ){
         this.pnr=pnr;
         this.flight=flight;
         this.from=from;
         this.to=to;
         this.departureDateTime=departureDateTime;
         this.arrivalDateTime=arrivalDateTime;
         this.seatNo=seatNo;
         this.passenger=passenger;
         this.cancelled=cancelled;
         this.price=price;
    }

    //getter setters
    public String getPnr() {
        return pnr;
    }
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }
    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }
    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public boolean getIsCancelled() {
        return cancelled;
    }
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Passenger getPassenger() {
        return passenger;
    }
    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    //Class Diagram actions

    public String checkStatus(){
        return "";
    }
    public int getFlightDuration(){
        return 0;
    }
    public void cancel()
    {

    }

}
