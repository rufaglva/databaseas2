package com.examples;

public class customers {
    private int customer_id;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;
    private String address;

    public customers(int customer_id, String customerName, String customerEmail, String phoneNumber, String address) {
        this.customer_id = customer_id;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "CustomerId: " + customer_id +
                ", CustomerName: " + customerName +
                ", CustomerEmail: " + customerEmail +
                ", PhoneNumber: " + phoneNumber +
                ", Address: " + address;
    }

    // Getters and setters
    public int getCustomerId() {
        return customer_id;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public customers(String customerName, String customerEmail, String phoneNumber, String address) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
}
