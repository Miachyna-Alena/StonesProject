package by.itstep.miachyna.examtask.model.entity;

import by.itstep.miachyna.examtask.model.enums.Fineness;
import by.itstep.miachyna.examtask.model.enums.Material;

public class Chain {
    private Material material;
    private Fineness fineness;
    private double weight;
    private double length;
    private double price;

    public Chain() {
    }

    public Chain(Material material, Fineness fineness, double weight, double length, double price) {
        super();
        this.material = material;
        this.fineness = fineness;
        this.weight = weight;
        this.length = length;
        this.price = price;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Fineness getFineness() {
        return fineness;
    }

    public void setFineness(Fineness fineness) {
        this.fineness = fineness;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if (length > 0) {
            this.length = length;
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

    @Override
    public String toString() {
        return "\nChain: "
                + "\nMaterial: " + this.getMaterial()
                + "\nFineness = " + this.getFineness()
                + "\nWeight = " + String.format("%.2f gram", this.getWeight())
                + "\nLength = " + String.format("%.2f mm", this.getLength())
                + "\nPrice = " + String.format("%.2f $", this.getPrice());
    }
}
