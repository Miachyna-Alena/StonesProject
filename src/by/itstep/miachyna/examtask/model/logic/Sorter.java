package by.itstep.miachyna.examtask.model.logic;

import by.itstep.miachyna.examtask.model.entity.Stone;

import java.util.Comparator;
import java.util.List;

public class Sorter {
    public static List<Stone> sortStonesByWeight(List<Stone> stones) {
        if (stones == null) {
            return List.of();
        }
        stones.sort(new Comparator<Stone>() {
            @Override
            public int compare(Stone stoneOne, Stone stoneTwo) {
                return Double.compare(stoneOne.getWeight(), stoneTwo.getWeight()); // Sorting by weight ascending
//              return Double.compare(stoneOne.getWeight(), stoneTwo.getWeight()); // Sorting by weight descending
            }
        });
        return stones;
    }

    public static List<Stone> sortStonesByPrice(List<Stone> stones) {
        if (stones == null) {
            throw new RuntimeException();
        }
        stones.sort(new Comparator<Stone>() {
            @Override
            public int compare(Stone stoneOne, Stone stoneTwo) {
                return Double.compare(stoneOne.getPrice(), stoneTwo.getPrice()); // Sorting by price ascending
//              return Double.compare(stoneTwo.getPrice(), stoneOne.getPrice()); // Sorting by price descending
            }
        });
        return stones;
    }
}
