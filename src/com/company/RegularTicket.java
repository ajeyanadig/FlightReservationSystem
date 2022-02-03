package com.company;

public class RegularTicket extends Ticket {
    public RegularTicket(String pnr, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, boolean cancelled, float price){
        super( pnr,  from,  to,  departureDateTime,  arrivalDateTime,  seatNo,  passenger,  cancelled,  price);
    }
    public String specialServices;

    public String getSpecialServices() {
        return specialServices;
    }

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
