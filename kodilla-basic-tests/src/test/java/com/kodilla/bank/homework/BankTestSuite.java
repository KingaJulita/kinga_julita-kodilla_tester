package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void testAddCash() {
        Bank bank = new Bank();
        bank.addPKOCash(100);
        assertEquals(100, bank.getCashMashinesEveryBankBalans(),0.01);
        bank.addBNPParibas(1000);
        assertEquals(1100, bank.getCashMashinesEveryBankBalans(), 0.01);
        bank.addSantander(200);
        assertEquals(1300, bank.getCashMashinesEveryBankBalans(), 0.01);
    }

    @Test
    public void testCashOutAmount() {
        Bank bank = new Bank();
        bank.addPKOCash(-100);
        bank.addEuroBank(500);
        bank.addAliorbank(-300);
        bank.addBNPParibas(1000);
        bank.addSantander(-200);
        assertEquals(3, bank.getCashOutAmount());
    }

    @Test
    public void testCashInAmount() {
        Bank bank = new Bank();
        bank.addPKOCash(-100);
        bank.addEuroBank(500);
        bank.addAliorbank(300);
        bank.addBNPParibas(1000);
        bank.addSantander(-200);
        assertEquals(3, bank.getCashInAmount());
    }

    @Test
    public void testCashOutAverage() {
        Bank bank = new Bank();
        bank.addPKOCash(-100);
        bank.addEuroBank(500);
        bank.addAliorbank(-300);
        bank.addBNPParibas(1000);
        bank.addSantander(-200);
        assertEquals(-200, bank.getCashOutAverage(), 0.01);
    }

    @Test
    public void testCashInAverage() {
        Bank bank = new Bank();
        bank.addPKOCash(-100);
        bank.addEuroBank(500);
        bank.addAliorbank(300);
        bank.addBNPParibas(1000);
        bank.addSantander(-200);
        assertEquals(600, bank.getCashInAverage(), 0.01);
    }
}
