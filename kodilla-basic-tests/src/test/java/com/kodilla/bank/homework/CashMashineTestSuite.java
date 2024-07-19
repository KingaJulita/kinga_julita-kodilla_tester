package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMashineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMashine cashMashine = new CashMashine();
        int [] transaction = cashMashine.getTransactions();
        assertEquals(0, transaction.length);
    }
    @Test
    public void shouldAddThreeElementsToArray() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(100);
        cashMashine.add(500);
        cashMashine.add(300);

        int[] transactions = cashMashine.getTransactions();
        assertEquals(3, transactions.length);
        assertEquals(100,transactions[0]);
        assertEquals(500, transactions[1]);
        assertEquals(300, transactions[2]);
    }
    @Test
    public void shouldCalculateBalance() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(100);
        cashMashine.add(-500);
        cashMashine.add(300);
        cashMashine.add(1000);
        cashMashine.add(-200);

        assertEquals(700, cashMashine.getBalance(),0.01);
    }
    @Test
    public void shouldReturnAverageEqualsZeroIsArrayIsEmpty() {
        CashMashine cashMashine = new CashMashine();

        assertEquals(0, cashMashine.getBalance(), 0.01);
    }
    @Test
    public void shouldReturnSumNumberCashIn() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(100);
        cashMashine.add(500);
        cashMashine.add(-300);
        cashMashine.add(1000);
        cashMashine.add(200);

        assertEquals(4, cashMashine.getNumberCashIn(), 0.01);
    }
    @Test
    public void shouldReturnSumNumberCashOut() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-100);
        cashMashine.add(500);
        cashMashine.add(-300);
        cashMashine.add(1000);
        cashMashine.add(-200);

        assertEquals(3, cashMashine.getNumberCashOut(), 0.01);
    }
    @Test
    public void shouldReturnAverageCashIn() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-100);
        cashMashine.add(500);
        cashMashine.add(300);
        cashMashine.add(1000);
        cashMashine.add(-200);

        assertEquals(600,cashMashine.getCashInAverage(), 0.01);
    }
    @Test
    public void shouldReturnAverageCashOut() {
        CashMashine cashMashine = new CashMashine();
        cashMashine.add(-100);
        cashMashine.add(500);
        cashMashine.add(-300);
        cashMashine.add(1000);
        cashMashine.add(-200);

        assertEquals(-200, cashMashine.getCashOutAverage(), 0.01);
    }
}
