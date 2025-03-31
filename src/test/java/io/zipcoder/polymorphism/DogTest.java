package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class DogTest{
    @Test
    public void testName(){
        Pet dog = new Dog();
        dog.setName("Scooby");

        Assert.assertEquals("Scooby", dog.getName());
    }

}