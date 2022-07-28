package by.itstep.miachyna.examtask.model.entity;

import by.itstep.miachyna.examtask.model.enums.Color;

public class Stone {
    private double weight;
    private double price;
    private Color color;

    public Stone() {
    }

    public Stone(double weight, double price, Color color) {
        this.weight = weight;
        this.price = price;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "\nColor: " + color
                + "\nWeight = " + String.format("%.2f ct", weight)
                + "\nPrice = " + String.format("%.2f $", price);
    }
}
