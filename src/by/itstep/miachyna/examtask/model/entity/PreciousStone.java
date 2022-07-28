package by.itstep.miachyna.examtask.model.entity;

import by.itstep.miachyna.examtask.model.enums.Color;
import by.itstep.miachyna.examtask.model.enums.PreciousStoneType;

public class PreciousStone extends Stone {
    private PreciousStoneType name;

    public PreciousStone() {
        super();
    }

    public PreciousStone(double weight, double price, Color color, PreciousStoneType name) {
        super(weight, price, color);
        this.name = name;
    }

    public PreciousStoneType getName() {
        return name;
    }

    public void setName(PreciousStoneType name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "\nPrecious Stone:"
                + super.toString()
                + "\n";
    }
}
