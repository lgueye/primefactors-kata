package org.diveintojee.primefactors;

import static org.diveintojee.primefactors.PrimeFactors.generate;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author louis.gueye@gmail.com
 */
public class PrimeFactorsTest {

    @Test
    public void four() {
        Assert.assertEquals(list(2, 2), generate(4));
    }

    @Test
    public void height() {
        Assert.assertEquals(list(2, 2, 2), generate(8));
    }

    private List<Integer> list(final int... ints) {
        final List<Integer> list = new ArrayList<Integer>();

        for (final int i : ints) {
            list.add(i);
        }

        return list;
    }

    @Test
    public void nine() {
        Assert.assertEquals(list(3, 3), generate(9));
    }

    @Test
    public void one() {
        Assert.assertEquals(list(), generate(1));
    }

    @Test
    public void six() {
        Assert.assertEquals(list(2, 3), generate(6));
    }

    @Test
    public void three() {
        Assert.assertEquals(list(3), generate(3));
    }

    @Test
    public void two() {
        Assert.assertEquals(list(2), generate(2));
    }
}
