package com.markets.bean;

public class Address {
    private String addressline1;
    private String addressline2;

    public Address(String addressline1, String addressline2) {
        super();
        System.out.println("we are here..");
        this.addressline1 = addressline1;
        this.addressline2 = addressline2;
    }

    public Address() {

    }


    @Override
    public String toString() {
        return "Address{" +
                "addressline1='" + addressline1 + '\'' +
                ", addressline2='" + addressline2 + '\'' +
                '}';
    }



    public String getAddressline1() {
        return addressline1;
    }

    public void setAddressline1(String addressline1) {
        this.addressline1 = addressline1;
    }

    public String getAddressline2() {
        return addressline2;
    }

    public void setAddressline2(String addressline2) {
        this.addressline2 = addressline2;
    }


}
