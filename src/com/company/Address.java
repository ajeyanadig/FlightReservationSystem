package com.company;

public class Address {
    public String street;
    public String city;
    public String state;
    public Address(String newStreet, String newCity, String newState){
        this.street= newStreet;
        this.city= newCity;
        this.state= newState;
    }
    public String getAddressDetails(){
        return "blah";
    }
    public void updateAddressDetails(String newStreet, String newCity, String newState){
        this.street= newStreet;
        this.city= newCity;
        this.state= newState;
    }
}
