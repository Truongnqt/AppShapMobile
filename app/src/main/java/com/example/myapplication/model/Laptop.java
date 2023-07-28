package com.example.myapplication.model;

public class Laptop {
    private String Id;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getYeaoduce() {
        return yeaoduce;
    }

    public void setYeaoduce(String yeaoduce) {
        this.yeaoduce = yeaoduce;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    private String name;
    private int count;
    private String yeaoduce;
    private String producer;
    private double money;

}
