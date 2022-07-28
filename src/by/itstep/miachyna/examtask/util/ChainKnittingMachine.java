package by.itstep.miachyna.examtask.util;

import by.itstep.miachyna.examtask.model.entity.Chain;
import by.itstep.miachyna.examtask.model.enums.Fineness;
import by.itstep.miachyna.examtask.model.enums.Material;

import java.util.Random;

public class ChainKnittingMachine {
    public static final double MAX_WEIGHT = 50.0;
    public static final double MIN_WEIGHT = 5.0;

    public static final double MAX_LENGTH = 90.0;
    public static final double MIN_LENGTH = 35.0;

    public static final double MAX_PRICE = 5000.0;
    public static final double MIN_PRICE = 50.0;

    public static Chain createChain() {
        Random random = new Random();
        return new Chain(
                Material.values()[new Random().nextInt(Material.values().length)],
                Fineness.values()[new Random().nextInt(Fineness.values().length)],
                random.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT,
                random.nextDouble() * (MAX_LENGTH - MIN_LENGTH) + MIN_LENGTH,
                random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE);
    }
}
