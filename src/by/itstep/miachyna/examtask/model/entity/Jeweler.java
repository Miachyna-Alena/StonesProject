package by.itstep.miachyna.examtask.model.entity;

import by.itstep.miachyna.examtask.util.ChainKnittingMachine;
import by.itstep.miachyna.examtask.util.ExpertGemologist;

import java.util.ArrayList;
import java.util.List;

public class Jeweler {
    public static Necklace createNecklace(Necklace necklace, int stoneNumber) throws IllegalAccessException {
        List<Stone> stones = new ArrayList<>();
        for (int i = 0; i < stoneNumber; i++) {
            stones.add(ExpertGemologist.createStone());
        }
        necklace.setStoneList(stones);
        necklace.setChain(ChainKnittingMachine.createChain());
        return necklace;
    }
}
