package io.zipcoder.polymorphism;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class BirdTest {

   @Test
   public void testName(){
       Pet bird = new Bird();
       bird.setName("larry");

       Assert.assertEquals("larry", bird.getName());
   }
}