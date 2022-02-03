package com.company;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Ticket {
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

    public Ticket( String pnr,Flight flight, String from, String to, String departureDateTime, String arrivalDateTime, String seatNo, Passenger passenger, float price ){
         this.pnr=pnr;
         this.flight=flight;
         this.from=from;
         this.to=to;
         this.departureDateTime=departureDateTime;
         this.arrivalDateTime=arrivalDateTime;
         this.seatNo=seatNo;
         this.passenger=passenger;
         this.cancelled= flight.checkAvaialability();
         this.price=price;
    }

    //Class Diagram actions

    public String checkStatus(){
        return "Ticket{" +
                "pnr='" + this.pnr + '\'' +
                ", from='" + this.from + '\'' +
                ", to='" + to + '\'' +
                ", departureDateTime='" + this.departureDateTime + '\'' +
                ", arrivalDateTime='" + this.arrivalDateTime + '\'' +
                ", seatNo='" + this.seatNo + '\'' +
                ", isAvaiable=" + this.cancelled +
                ", price=" + this.price + ", flight duration="+ ((float)getFlightDuration())+
                '}';
    }
    public int getFlightDuration(){
            // SimpleDateFormat converts the
            // string format to date object
            SimpleDateFormat sdf
                    = new SimpleDateFormat(
                    "dd-MM-yyyy HH:mm:ss");

            // Try Block
            try {

                // parse method is used to parse
                // the text from a string to
                // produce the date
                Date d1 = sdf.parse(this.departureDateTime);
                Date d2 = sdf.parse(this.arrivalDateTime);

                // Calucalte time difference in minutes
                long difference_In_Time
                        = d2.getTime() - d1.getTime();


                long difference_In_Minutes
                        = (difference_In_Time
                        / (1000 * 60))
                        % 60;

                return (int)difference_In_Minutes;

            }

            // Catch the Exception
            catch (ParseException e) {
                e.printStackTrace();
                return 0;
            }

    }
    public void cancel()
    {
        System.out.println("Ticket is cancelled");
    }

}
