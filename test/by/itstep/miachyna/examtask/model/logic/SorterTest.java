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

public class SorterTest {
    private static List<Stone> stones;

    @Before
    public void init() {
        stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));
        stones.add(new SemiPreciousStone(9, 600, Color.WHITE, SemiPreciousStoneType.AGATE));
        stones.add(new PreciousStone(5, 4800, Color.YELLOW, PreciousStoneType.ALEXANDRITE));
    }

    @Test
    public void testSortStonesByWeightPositive() {
        String expected = String.valueOf(List.of(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY),
                new PreciousStone(5, 4800, Color.YELLOW, PreciousStoneType.ALEXANDRITE),
                new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET),
                new SemiPreciousStone(9, 600, Color.WHITE, SemiPreciousStoneType.AGATE)));
        String actual = String.valueOf(Sorter.sortStonesByWeight(stones));

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStonesByPricePositive() {
        String expected = String.valueOf(List.of(new SemiPreciousStone(9, 600, Color.WHITE, SemiPreciousStoneType.AGATE),
                new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET),
                new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY),
                new PreciousStone(5, 4800, Color.YELLOW, PreciousStoneType.ALEXANDRITE)));
        String actual = String.valueOf(Sorter.sortStonesByPrice(stones));

        assertEquals(expected, actual);
    }

    @Test
    public void testSortStonesByWeighWithNull() {
        String expected = String.valueOf(List.of());
        String actual = String.valueOf(Sorter.sortStonesByWeight(null));

        assertEquals(expected, actual);
    }

    @Test(expected = RuntimeException.class)
    public void testSortStonesByPriceWithNull() {
        Sorter.sortStonesByPrice(null);
    }
}
