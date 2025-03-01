package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long security_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private LocalDate purchase_date;

    @Column(nullable = false)
    private Double purchase_price;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    // Constructor
    public Security(String name, String category, LocalDate purchase_date, Double purchase_price, Integer quantity, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchase_date = purchase_date;
        this.purchase_price = purchase_price;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    // Getters and Setters
    public Long getSecurity_id() {
        return security_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(LocalDate purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Double getPurchase_price() {
        return purchase_price;
    }

    public void setPurchase_price(Double purchase_price) {
        this.purchase_price = purchase_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}