package ru.course;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class ArrayIteratorTest {

    private Double[] testArray = {10., 20., 30., 40., 50., 60., 70., 80., 90., 100.};

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void hasNext() throws Exception {
        ArrayIterator iterator = new ArrayIterator<Double>(testArray);
        assertTrue(iterator.hasNext());

        for (int i = 0; i < testArray.length; i++)
            iterator.next();
        assertFalse("hasNext должен вернуть false", iterator.hasNext());

        iterator = new ArrayIterator<Double>(null);
        assertFalse(iterator.hasNext());
    }

    @Test
    public void next() throws Exception {
        ArrayIterator iterator = new ArrayIterator<Double>(testArray);

        for (int i = 0; i < testArray.length; i++) {
            Double item = (Double) iterator.next();
            assertEquals(item, testArray[i]);
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void next_exeption() throws Exception {
        ArrayIterator iterator = new ArrayIterator<Double>(testArray);

        for (int i = 0; i < testArray.length; i++) {
            Double item = (Double) iterator.next();
            assertEquals(item, testArray[i]);
        }
        iterator.next();
    }
}