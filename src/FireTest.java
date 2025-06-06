import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FireTest {
    @Test
    public void testTimeToBurnExample1() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 2;
        int matchC = 6;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnExample2() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnExample3() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 8;

        int expected = 12;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testTimeToBurnExample4() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 3;
        int matchC = 0;

        int expected = 11;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }


    @Test
    public void testTimeToBurnExample5() {
        char[][] forest = {
            {'t','.','.','t','t','t','t','.','t'},
            {'.','.','t','t','.','.','.','.','t'},
            {'.','.','t','t','t','t','t','t','t'},
            {'t','t','t','t','.','.','.','.','.'}
        };

        int matchR = 3;
        int matchC = 3;

        int expected = 8;
        int actual = Fire.timeToBurn(forest, matchR, matchC);

        assertEquals(expected, actual);
    }

    @Test
    public void testForestHasNoTrees() {
        char[][] forest = {
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'},
            {'.','.','.','.','.','.','.','.','.'}
        };

        int matchR = 0;
        int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testForestHasOnlyTrees() {
        char[][] forest = {
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'},
            {'t','t','t','t','t','t','t','t','t'}
        };

        int matchR = 3;
        int matchC = 8;

        int expected = 11;
        int actual = Fire.timeToBurn(forest, matchR, matchC);
        assertEquals(expected, actual);
    }

    @Test
    public void testForestIsSingleTree() {
    char[][] forest = {
        {'t'}
    };

    int matchR = 0;
    int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);
        assertEquals(expected, actual);
    }

    @Test
    public void testForestIsSingleEmptySpace() {
    char[][] forest = {
        {'.'}
    };

    int matchR = 0;
    int matchC = 0;

        int expected = 0;
        int actual = Fire.timeToBurn(forest, matchR, matchC);
        assertEquals(expected, actual);
    }
}