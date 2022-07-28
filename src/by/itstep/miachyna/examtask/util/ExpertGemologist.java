package by.itstep.miachyna.examtask.util;

import by.itstep.miachyna.examtask.model.entity.PreciousStone;
import by.itstep.miachyna.examtask.model.entity.SemiPreciousStone;
import by.itstep.miachyna.examtask.model.entity.Stone;
import by.itstep.miachyna.examtask.model.enums.Color;
import by.itstep.miachyna.examtask.model.enums.PreciousStoneType;
import by.itstep.miachyna.examtask.model.enums.SemiPreciousStoneType;

import java.util.Random;

public class ExpertGemologist {
    public static final double MAX_PRICE = 5000.0;
    public static final double MIN_PRICE = 500.0;

    public static final double MAX_WEIGHT = 10.0;
    public static final double MIN_WEIGHT = 1.0;

    public static Stone createStone() throws IllegalAccessException {
        Random random = new Random();
        return switch (random.nextInt(2)) {
            case 0 -> new PreciousStone(
                    random.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT,
                    random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE,
                    Color.values()[(new Random().nextInt(Color.values().length))],
                    PreciousStoneType.values()[(new Random().nextInt(PreciousStoneType.values().length))]
            );
            case 1 -> new SemiPreciousStone(
                    random.nextDouble() * (MAX_WEIGHT - MIN_WEIGHT) + MIN_WEIGHT,
                    random.nextDouble() * (MAX_PRICE - MIN_PRICE) + MIN_PRICE,
                    Color.values()[(new Random().nextInt(Color.values().length))],
                    SemiPreciousStoneType.values()[(new Random().nextInt(SemiPreciousStoneType.values().length))]
            );
            default -> throw new IllegalAccessException();
        };
    }
}
