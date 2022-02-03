package com.company;

public class RegularTicket extends Ticket {
    //attributes
    public String specialServices;

    public RegularTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, float price, String specialServices){
        super( pnr,flight, from,to,departureDateTime,arrivalDateTime, seatNo,passenger,price);
        this.specialServices=specialServices;
    }

    //Diagram actions
    public String getSpecialServices() {
        return specialServices;
    }
    public String setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
        return "\n Special service changed to:" +this.specialServices+"\n";
    }
}
