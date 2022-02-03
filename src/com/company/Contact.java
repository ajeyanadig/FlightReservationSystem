package com.company;

public class Contact {
    public int id;
    public String contactName;
    public String contactPhone;
    public String contactEmail;

    public Contact( String contactName, String contactPhone, String contactEmail){
        this.contactName= contactName;
        this.contactPhone= contactPhone;
        this.contactEmail= contactEmail;
    }
    public String getContactDetails(){
        return "";
    }
    public void updateAddressDetails(int id, String contactName, String contactPhone, String contactEmail){
        this.contactName= contactName;
        this.contactPhone= contactPhone;
        this.contactEmail= contactEmail;
    }
}
