package com.company;

public class Ticket {
    public String pnr;
    public String from;
    public String to;
    public String departureDateTime;
    public String arrivalDateTime;
    public String seatNo;
    public Passenger passenger;
    public boolean cancelled;
    public float price;

    public Ticket( String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price ){
         this.pnr=pnr;
         this.from=from;
         this.to=to;
         this.departureDateTime=departureDateTime;
         this.arrivalDateTime=arrivalDateTime;
         this.seatNo=seatNo;
         this.passenger=passenger;
         this.cancelled=cancelled;
         this.price=price;
    }

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
