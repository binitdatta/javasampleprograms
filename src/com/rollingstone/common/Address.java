package com.rollingstone.common;

public class Address
{
    private long addressID;
    private String streetName;
    private String houseNumber;
    private String city;
    private String state;
    private String country;
    private String zipCode;

    public Address()
    {

    }

    public Address(String streetName, String houseNumber, String city, String state, String country, String zipCode)
    {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode = zipCode;
    }

    public long getAddressID()
    {
        return addressID;
    }

    public void setAddressID(long addressID)
    {
        this.addressID = addressID;
    }

    public String getStreetName()
    {
        return streetName;
    }

    public void setStreetName(String streetName)
    {
        this.streetName = streetName;
    }

    public String getHouseNumber()
    {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber)
    {
        this.houseNumber = houseNumber;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getCountry()
    {
        return country;
    }

    public void setCountry(String country)
    {
        this.country = country;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

}
