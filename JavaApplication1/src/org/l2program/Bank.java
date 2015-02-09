/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.l2program;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author sander
 */
public class Bank {

    private Map<Long, BankAccount> accounts;

    public int field;

    public int method() {
        return 0;
    }

    public Bank() {
        BankAccount acct1 = new BankAccount(1000);
        accounts = new HashMap<>();
    }

    public long registerAccount(BankAccount newAccount) {
        accounts.put(newAccount.getId(), newAccount);
        return newAccount.getId();
    }

    public BankAccount queryAccount(long id) {
        return accounts.get(id);
    }
    
    public void transferBetween(long source, long destination, int value) {
        BankAccount sourceAcct = queryAccount(source);
        BankAccount destinationAcct = queryAccount(destination);
        sourceAcct.transferTo(destinationAcct, value);
    }

}
