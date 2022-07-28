package by.itstep.miachyna.examtask.model.entity;

import by.itstep.miachyna.examtask.model.enums.Color;
import by.itstep.miachyna.examtask.model.enums.SemiPreciousStoneType;

public class SemiPreciousStone extends Stone {
    private SemiPreciousStoneType name;

    public SemiPreciousStone() {
        super();
    }

    public SemiPreciousStone(double weight, double price, Color color, SemiPreciousStoneType name) {
        super(weight, price, color);
        this.name = name;
    }

    public SemiPreciousStoneType getName() {
        return name;
    }

    public void setName(SemiPreciousStoneType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nSemi-Precious Stone:"
                + "\nName: " + name
                + super.toString()
                + "\n";
    }
}
