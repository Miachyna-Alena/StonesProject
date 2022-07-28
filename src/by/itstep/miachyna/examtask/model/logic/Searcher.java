package by.itstep.miachyna.examtask.model.logic;

import by.itstep.miachyna.examtask.model.entity.Stone;
import by.itstep.miachyna.examtask.model.enums.Color;

import java.util.ArrayList;
import java.util.List;

public class Searcher {
    public static final double MAX_PRICE = 5000.0;
    public static final double MIN_PRICE = 500.0;

    public static final double MAX_WEIGHT = 10.0;
    public static final double MIN_WEIGHT = 1.0;


    public static List<Stone> findStoneByColor(String color, List<Stone> stones) {
        List<Stone> foundStones = new ArrayList<>();
        for (Stone stone : stones) {
            if ((Color.valueOf(color)).equals(stone.getColor())) {
                foundStones.add(stone);
            }
        }
        return foundStones;
    }

    public static double findTheMostExpensiveStone(List<Stone> stones) {
        double maxPrice = MIN_PRICE;

        for (Stone stone : stones) {
            if (stone.getPrice() < MIN_PRICE || stone.getPrice() > MAX_PRICE) return 0.0;
            if (maxPrice < stone.getPrice()) {
                maxPrice = stone.getPrice();
            }
        }
        return maxPrice;
    }

    public static double findTheCheapestStone(List<Stone> stones) {
        double minPrice = MAX_PRICE;

        for (Stone stone : stones) {
            if (stone.getPrice() < MIN_PRICE || stone.getPrice() > MAX_PRICE) return 0.0;
            if (minPrice > stone.getPrice()) {
                minPrice = stone.getPrice();
            }
        }
        return minPrice;
    }

    public static double findTheHeaviestStone(List<Stone> stones) {
        double maxWeight = MIN_WEIGHT;
        for (Stone stone : stones) {
            if (stone.getWeight() < MIN_WEIGHT || stone.getWeight() > MAX_WEIGHT) return 0.0;
            if (maxWeight < stone.getWeight()) {
                maxWeight = stone.getWeight();
            }
        }
        return maxWeight;
    }

    public static double findTheEasiestStone(List<Stone> stones) {
        double minWeight = MAX_WEIGHT;
        for (Stone stone : stones) {
            if (stone.getWeight() < MIN_WEIGHT || stone.getWeight() > MAX_WEIGHT) return 0.0;
            if (minWeight > stone.getWeight()) {
                minWeight = stone.getWeight();
            }
        }
        return minWeight;
    }
}
