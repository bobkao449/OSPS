package com.example.OSPS;

public class ParkingSpot {
    private double PS_Lat;
    private double PS_Lng;
    private String status;
    private String PS_ID;

    public ParkingSpot(double PS_Lat, double PS_Lng, String status, String PS_ID) {
        this.PS_Lat = PS_Lat;
        this.PS_Lng = PS_Lng;
        this.status = status;
        this.PS_ID = PS_ID;
    }

    // Getters and setters

    public double getPS_Lat() {
        return PS_Lat;
    }

    public void setPS_Lat(double PS_Lat) {
        this.PS_Lat = PS_Lat;
    }

    public double getPS_Lng() {
        return PS_Lng;
    }

    public void setPS_Lng(double PS_Lng) {
        this.PS_Lng = PS_Lng;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPS_ID() {
        return PS_ID;
    }

    public void setPS_ID(String PS_ID) {
        this.PS_ID = PS_ID;
    }
}
