/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prt452.main;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sujan
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
    }

    /**
     * Test of playOrQuit method, of class Main.
     */
    @Test
    public void testPlayOrQuit() {
        System.out.println("playOrQuit");
        String input = "S";
        boolean expResult = true;
        boolean result = Main.playOrQuit(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of numberOrNot method, of class Main.
     */
    @Test
    public void testNumberOrNot() {
        System.out.println("numberOrNot");
        String input = "20";
        boolean expResult = true;
        boolean result = Main.numberOrNot(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of greaterOrnot method, of class Main.
     */
    @Test
    public void testGreaterOrnot() {
        System.out.println("greaterOrnot");
        String input = "20";
        boolean expResult = false;
        boolean result = Main.greaterOrnot(input);
        assertEquals(expResult, result);
    }

    /**
     * Test of matchWithRandomNum method, of class Main.
     */
    @Test
    public void testMatchWithRandomNum() {
        System.out.println("matchWithRandomNum");
        String input = "50";
        int randomNumber = 50;
        boolean expResult = false;
        boolean result = Main.matchWithRandomNum(input, randomNumber);
        assertEquals(expResult, result);
    }
    
}
