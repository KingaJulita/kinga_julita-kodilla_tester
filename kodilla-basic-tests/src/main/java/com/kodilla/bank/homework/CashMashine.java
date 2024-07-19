package com.kodilla.bank.homework;

public class CashMashine {
    private  int[] transactions;
    private int size;

    public CashMashine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getBalance() {
        if(this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for(int i = 0; i < this.transactions.length; i ++) {
            sum += this.transactions[i];
        }
        return sum;
    }

    public int getNumberCashIn() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }

    public int getNumberCashOut() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int count = 0;
        for ( int i = 0; i < this.transactions.length; i++) {
            if (this.transactions [i] < 0) {
                count++;
            }
        }
        return count;
    }
    public double getCashOutAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions [i] < 0) {
                sum += this.transactions [i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) sum/count;
    }
    public double getCashInAverage() {
        if(this.transactions.length == 0) {
            return 0;
        }
        int sum = 0;
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions [i] > 0) {
                sum += this.transactions [i];
                count++;
            }
        }
        if (count == 0) {
            return 0;
        }
        return (double) sum/count;
    }
}
