/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.l2program;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sander
 */
public class BankAccountTest {
    
    public BankAccountTest() {
    }
    
    @Before
    public void setUp() {
    }

    /**
     * Test of deposit method, of class BankAccount.
     */
    @Test
    public void testDeposit() {
        System.out.println("deposit");
        int x = 0;
        BankAccount instance = new BankAccount();
        instance.deposit(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class BankAccount.
     */
    @Test
    public void testWithdraw() {
        System.out.println("withdraw");
        int x = 0;
        BankAccount instance = new BankAccount();
        instance.withdraw(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBalance method, of class BankAccount.
     */
    @Test
    public void testGetBalance() {
        System.out.println("getBalance");
        BankAccount instance = new BankAccount();
        int expResult = 0;
        int result = instance.getBalance();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transferTo method, of class BankAccount.
     */
    @Test
    public void testTransferTo() {
        System.out.println("transferTo");
        BankAccount destination = null;
        int value = 0;
        BankAccount instance = new BankAccount();
        instance.transferTo(destination, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
