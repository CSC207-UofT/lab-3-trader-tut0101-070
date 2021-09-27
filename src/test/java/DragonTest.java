/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DragonTest {
    Dragon g;

    @Before
    public void setUp() throws Exception {
        g = new Dragon(100, 1000);
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Bruh!", g.sound());
    }
    
    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(100, g.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        g.upgradeSpeed();
        assertEquals(101, g.getMaxSpeed());
    }
    
    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        g.downgradeSpeed();
        assertEquals(99, g.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(1000, g.getPrice());
    }

}