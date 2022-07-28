package by.itstep.miachyna.examtask.model.entity;

import java.util.ArrayList;
import java.util.List;

public class Necklace {
    private List<Stone> stones = new ArrayList<Stone>();
    private Chain chain;

    public Necklace() {
    }

    public List<Stone> getStoneList() {
        return stones;
    }

    public void setStoneList(List<Stone> stoneList) {
        this.stones = stoneList;
    }

    public Chain getChain() {
        return chain;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    @Override
    public String toString() {
        return "Necklace:\n"
                + chain + "\n"
                + "\nStones List " + stones;
    }
}
