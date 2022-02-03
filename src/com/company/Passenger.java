package com.company;

public class Passenger {
    private static int idCounter;
    private int id;


    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
    }
     private Address address;

    private static class Contact {
        String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
    }
     private Contact contact;

    static {
        idCounter = 0;
    }

    public Passenger(int id,String street, String city, String state, String name, String phone, String email ){
        this.id=++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);

    }
    public int getId() {
        return this.id;
    }
    public int getPassengerCount()
    {
        return idCounter;
    }
   /* public Contact/String getContactDetails()
    {

    }
    public Address/String getAddressDetails()
    {

    }*/
}
