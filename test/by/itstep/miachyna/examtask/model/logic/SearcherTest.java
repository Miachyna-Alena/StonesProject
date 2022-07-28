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

public class SearcherTest {
    private static List<Stone> stones;

    @Before
    public void init() {
        stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));
    }

    @Test
    public void testFindStoneByColorPositive() {
        String color = "BLUE";

        String expected = String.valueOf(List.of(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY)));
        String actual = String.valueOf(Searcher.findStoneByColor(color, stones));

        assertEquals(expected, actual);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindStoneByColorNegative() {
        String color = "PURPLE";
        Searcher.findStoneByColor(color, stones);
    }

    @Test
    public void testFindTheMostExpensiveStonePositive() {
        double expected = 2500;
        double actual = Searcher.findTheMostExpensiveStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheCheapestStonePositive() {
        double expected = 1500;
        double actual = Searcher.findTheCheapestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheHeaviestStonePositive() {
        double expected = 7;
        double actual = Searcher.findTheHeaviestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheEasiestStonePositive() {
        double expected = 3;
        double actual = Searcher.findTheEasiestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheMostExpensiveStoneBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 5000, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 5000;
        double actual = Searcher.findTheMostExpensiveStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheCheapestStoneBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 5000, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 500;
        double actual = Searcher.findTheCheapestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheHeaviestStoneBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(1, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(10, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 10;
        double actual = Searcher.findTheHeaviestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheEasiestStoneBoundaryValues() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(1, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(10, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 1;
        double actual = Searcher.findTheEasiestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheMostExpensiveStoneNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 5001, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheMostExpensiveStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheMostExpensiveStoneNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 0, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheMostExpensiveStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheCheapestStoneNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 5001, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheCheapestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheCheapestStoneNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 0, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheCheapestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheHeaviestStoneNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(0, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheHeaviestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheHeaviestStoneNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(11, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheHeaviestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheEasiestStoneNegative() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(0, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(3, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheEasiestStone(stones);

        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testFindTheEasiestStoneNegative01() {
        List<Stone> stones = new ArrayList<>();
        stones.add(new SemiPreciousStone(7, 1500, Color.BROWN, SemiPreciousStoneType.GARNET));
        stones.add(new PreciousStone(11, 2500, Color.BLUE, PreciousStoneType.RUBY));

        double expected = 0.0;
        double actual = Searcher.findTheEasiestStone(stones);

        assertEquals(expected, actual, 0.001);
    }
}
