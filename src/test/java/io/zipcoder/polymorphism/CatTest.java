package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void testName(){
        Pet cat = new Cat();
        cat.setName("perry");

        Assert.assertEquals("perry", cat.getName());
    }
}
