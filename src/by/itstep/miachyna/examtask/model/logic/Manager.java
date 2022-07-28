package by.itstep.miachyna.examtask.model.logic;

import by.itstep.miachyna.examtask.model.entity.Stone;

import java.util.List;

public class Manager {
    public static final double MAX_PRICE = 5000.0;
    public static final double MIN_PRICE = 500.0;

    public static final double MAX_WEIGHT = 10.0;
    public static final double MIN_WEIGHT = 1.0;

    public static double calculateTotalStoneWeight(List<Stone> stones) {
        double totalWeight = 0.0;
        for (Stone stone : stones) {
            totalWeight += stone.getWeight();
            if (stone.getWeight() < MIN_WEIGHT || stone.getWeight() > MAX_WEIGHT) return 0.0;
        }
        return totalWeight;
    }

    public static double calculateTotalStonePrice(List<Stone> stones) {
        double totalPrice = 0.0;
        for (Stone stone : stones) {
            totalPrice += stone.getPrice();
            if (stone.getPrice() < MIN_PRICE || stone.getPrice() > MAX_PRICE) return 0.0;
        }
        return totalPrice;
    }
}
