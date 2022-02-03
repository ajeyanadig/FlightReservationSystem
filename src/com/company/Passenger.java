package com.company;

public class Passenger {
    private static int idCounter;
    private int id;

    static {
        idCounter = 0;
    }
    private static class Address {
        String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
            System.out.println(this.city);
        }
        public String getAddressDetails(){
            return "Contact{" +
                    "name='" + street + '\'' +
                    ", phone='" + city + '\'' +
                    ", email='" + state + '\'' +
                    "}\n";
        }
        public void updateAddressDetails(String contact){
            String[] contactArr= contact.split(",",3);
            this.street= contactArr[0];
            this.city=contactArr[1];
            this.state=contactArr[2];

        }
    }
     private Address address;

    private static class Contact {
        String name;
        String phone;
        String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
        public String getContactDetails(){
            return "Contact{" +
                    "name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    "}\n";
        }
        public void updateContactDetails(String contact){
            String[] contactArr= contact.split(",",3);
            this.name= contactArr[0];
            this.phone=contactArr[1];
            this.email=contactArr[2];

        }
    }
     private Contact contact;



    public Passenger(String street, String city, String state, String name, String phone, String email ){
        this.id=++idCounter;
        this.address = new Address(street, city, state);
        this.contact = new Contact(name, phone, email);
        System.out.println(this.id);



    }
    public Contact getContact(){
        //System.out.println(this.contact.getContactDetails());
        return this.contact;
    }
    public Address getAddress(){
        return this.address;
    }




}
