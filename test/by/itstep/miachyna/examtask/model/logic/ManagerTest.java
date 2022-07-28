package by.itstep.miachyna.examtask.model.logic;

import by.itstep.miachyna.examtask.model.entity.PreciousStone;
import by.itstep.miachyna.examtask.model.entity.SemiPreciousStone;
import by.itstep.miachyna.examtask.model.entity.Stone;
import by.itstep.miachyna.examtask.model.enums.Color;
import by.itstep.miachyna.examtask.model.enums.PreciousStoneType;
import by.itstep.miachyna.examtask.model.enums.SemiPreciousStoneType;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private static List<Stone> stones;

    @Before
    public void init() {
        stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));
    }

    @Test
    public void testCalculateTotalStoneWeightPositive() {
        double expected = 10;
        double actual = Manager.calculateTotalStoneWeight(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStonePricePositive() {
        double expected = 4000;
        double actual = Manager.calculateTotalStonePrice(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStoneWeightBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(1, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(10, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 11;
        double actual = Manager.calculateTotalStoneWeight(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStonePriceBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 5000, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 5500;
        double actual = Manager.calculateTotalStonePrice(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStoneWeightNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(0, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Manager.calculateTotalStoneWeight(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStoneWeightNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(11, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Manager.calculateTotalStoneWeight(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStonePriceNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 0, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Manager.calculateTotalStonePrice(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testCalculateTotalStonePriceNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 5001, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Manager.calculateTotalStonePrice(stones);

        assertEquals(expected, actual, 0.001);
    }
}
