package com.demo.Medicine_Shop.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OrderId", length = 10)
    private int orderId;

    @ManyToOne
    @JoinColumn(name = "MedicineId")
    private Medicines medicine;  // Assuming a Many-to-One relationship with Medicines

    @Column(name = "OrderItemQty")
    private int orderItemQty;

    @Column(name = "OrderStatus")
    private String orderStatus;

    @Column(name = "OrderDate")
    private LocalDate orderDate;

    // Constructors, Getters, Setters, and toString method
    public Order() {}

    public Order(Medicines medicine, int orderItemQty, String orderStatus) {
        this.medicine = medicine;
        this.orderItemQty = orderItemQty;
        this.orderStatus = orderStatus;
        this.orderDate = LocalDate.now();  // Automatically set the order date
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Medicines getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicines medicine) {
        this.medicine = medicine;
    }

    public int getOrderItemQty() {
        return orderItemQty;
    }

    public void setOrderItemQty(int orderItemQty) {
        this.orderItemQty = orderItemQty;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", medicine=" + medicine + ", orderItemQty=" + orderItemQty + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
    }
}
