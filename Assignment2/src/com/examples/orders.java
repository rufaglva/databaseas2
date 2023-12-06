package com.examples;
import java.time.LocalDate;
import java.util.List;

public class orders {

    private int orderId;

    private customers customers;

    private LocalDate orderDate;

    private double totalAmount;

    private List<orders> orderDetails;

    public orders(int orderId, customers customers, LocalDate orderDate, double totalAmount, List<orders> orderDetails) {
        this.orderId = orderId;
        this.customers = customers;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
        this.orderDetails = orderDetails;
    }

    public orders(int orderId, LocalDate orderDate, double totalAmount) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "order_id: " + orderId +
                ", customer: " + customers +
                ", orderdate: " + orderDate +
                ", total_amount: " + totalAmount +
                ", orderDetails: " + orderDetails;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public customers getCustomer() {
        return customers;
    }

    public void setCustomer(customers customers) {
        this.customers = customers;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<orders> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<orders> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
