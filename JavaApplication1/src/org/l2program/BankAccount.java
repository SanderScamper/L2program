/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.l2program;

import java.util.LinkedList;

/**
 *
 * @author sander
 */
public class BankAccount {

    private final long id;
    private int balance;
    private LinkedList<String> log;

    public BankAccount(int balance) {
        this.id = generateId();
        this.balance = balance;
        this.log = new LinkedList<>();
        addLogEntry("Account created with initial balance of " + balance);
    }

    public void printLog() {
        for (String entry : log) {
            System.out.println(entry);
        }
    }

    private void addLogEntry(String entry) {
        log.add(entry + ", new balance: " + balance);
    }

    public void deposit(int x) {
        balance = balance + x;
        addLogEntry("Account balance increased by  " + x);
    }

    public void withdraw(int x) {
        balance = balance - x;
        addLogEntry("Account balance decreased by  " + x);
    }

    public BankAccount() {
        this(0);
    }

    /**
     * @return the balance
     */
    public int getBalance() {
        return balance;
    }

    public void transferTo(BankAccount destination, int value) {
        this.withdraw(value);
        destination.deposit(value);
    }

    static private long currentId;

    static {
        currentId = 0;
    }

    static private long generateId() {
        currentId++;
        return currentId;
    }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }
}
