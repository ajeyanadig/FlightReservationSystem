package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TouristTicket extends Ticket{


    //attributes
    private int locationCount;
    public String hotelAddress;
    public String[] selectedTouristLocation;

    public TouristTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, float price,String hotelAddress, String location){
        super( pnr,flight,from,to,departureDateTime,arrivalDateTime,seatNo,passenger,price);//back to ticket
        this.locationCount=0;
        this.hotelAddress=hotelAddress;
        selectedTouristLocation=new String[5];
        selectedTouristLocation[locationCount++]=location;

    }
    public TouristTicket(String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, float price,String hotelAddress, String[] location){
        super( pnr,flight,from,to,departureDateTime,arrivalDateTime,seatNo,passenger,price);//back to ticket
        this.locationCount= location.length;
        this.hotelAddress=hotelAddress;
        selectedTouristLocation=new String[5];
        for(int i=0;i<locationCount;i++)
            selectedTouristLocation[i]=location[i];


    }

    //gettersetters


    public String getHotelAddress() {
        return hotelAddress;
    }
    public String getTouristLocations() {
        String total="";
        for(int i=0;i<locationCount;i++)
            total+=selectedTouristLocation[i]+" ";
        return total;
    }

    public void removeTouristLocations(String location){
        String[] str_array = selectedTouristLocation;
        List<String> list = new ArrayList<String>(Arrays.asList(str_array));
        list.remove(location);
        str_array = list.toArray(new String[0]);
        selectedTouristLocation=str_array;
        this.locationCount--;
    }

    public void addTouristLocations(String location){
        selectedTouristLocation[this.locationCount++]=location;
    }



}
