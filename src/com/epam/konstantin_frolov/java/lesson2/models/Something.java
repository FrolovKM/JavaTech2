package com.epam.konstantin_frolov.java.lesson2.models;

public class Something {
    private Integer power = null;
    private Integer weight = null;

    public Something(Integer power, Integer weight) {
        this.power = power;
        this.weight = weight;
    }

    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "[Object] Something";
    }
}