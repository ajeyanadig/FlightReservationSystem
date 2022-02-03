package com.company;

public class RegularTicket extends Ticket {
    //attributes
    public String specialServices;

    public RegularTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price){
        super( pnr,flight, from,to,departureDateTime,arrivalDateTime, seatNo,passenger,cancelled,price);
    }

    //getter setter
    public String getSpecialServices() {
        return specialServices;
    }
    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
