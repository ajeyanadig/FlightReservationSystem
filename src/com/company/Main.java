package com.company;

public class Main {

    public static void main(String[] args) {
    System.out.println("hi");
    Flight flight1= new Flight("op123", "Indigo", 50, 30);
    Passenger passenger1= new Passenger("3rd Street","Mysore","KA","Ajeya","911","anduwn");
    RegularTicket tick1= new RegularTicket("ABCD",flight1,"Mumbai","Banfalore","14-03-2022 12:30:30","14-03-2022 19:40:30","13E",passenger1,300, "Free food");
    System.out.println(tick1.checkStatus());
    String[] locations= {"CST","Gate","Falls"};
    TouristTicket tick2= new TouristTicket("ABCD",flight1,"Mumbai","Banfalore","14-03-2022 12:30:30","14-03-2022 19:40:30","13E",passenger1,300, "Hyatt",locations);
    
    }


}
