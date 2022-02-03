package com.company;

public class Main {
    public static void printTicketDetails(Ticket ticket){
    System.out.println("PNR NO OF TICKET IS "+ ticket.getPnr());
    }

    public static void main(String[] args) {
    //dependents
    Flight flight1= new Flight("70089", "Indigo", 50, 30);
    Passenger passenger1= new Passenger("3rd Street","Mysore","KA","Ajeya","911","some@gmail.com");
    String[] locations= {"CST","Gate","Falls"};

    //Tickets
    RegularTicket regularTicket= new RegularTicket("RE254",flight1,"Mumbai","Bangalore","14-03-2022 12:30:30","14-03-2022 19:40:30","13E",passenger1,300, "Free food");
    TouristTicket touristTicket= new TouristTicket("TO254",flight1,"Mumbai","Delhi","14-03-2022 12:30:30","14-03-2022 19:40:30","13E",passenger1,300, "Hyatt",locations);

    //functionCalls
    printTicketDetails(regularTicket);
    printTicketDetails(touristTicket);
    }


}
