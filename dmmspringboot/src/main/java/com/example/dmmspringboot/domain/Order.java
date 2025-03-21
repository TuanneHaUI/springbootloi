package com.example.dmmspringboot.domain;


import jakarta.persistence.*;

@Entity
@Table(name = "Ordes")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double totalPrice;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    public Order() {
    }

    public Order(long id, double totalPrice) {
        this.id = id;
        this.totalPrice = totalPrice;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
