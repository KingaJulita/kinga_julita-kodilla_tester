package com.kodilla.bank.homework;

public class Bank {

    private CashMashine PKO;
    private CashMashine EuroBank;
    private CashMashine Santander;
    private CashMashine BNPParibas;
    private CashMashine AliorBank;

    private CashMashine[] banks;

    public Bank() {
        this.PKO = new CashMashine();
        this.EuroBank = new CashMashine();
        this.Santander = new CashMashine();
        this.BNPParibas = new CashMashine();
        this.AliorBank = new CashMashine();
        this.banks = new CashMashine[] {PKO, EuroBank, Santander, BNPParibas, AliorBank};
    }

    public void addPKOCash(int cash) {
        this.PKO.add(cash);
    }

    public void addEuroBank(int cash) {
        this.EuroBank.add(cash);
    }

    public void addSantander(int cash) {
        this.Santander.add(cash);
    }

    public void addBNPParibas(int cash) {
        this.BNPParibas.add(cash);
    }

    public void addAliorbank(int cash) {
        this.AliorBank.add(cash);
    }

    public double getCashMashinesEveryBankBalans() {
        double sum = 0;
        for(CashMashine cashMashine : banks) {
            sum += cashMashine.getBalance();
        }
        return sum;
    }

    public double getCashOutAmount() {
        double sum = 0;
        for (CashMashine cashMashine : banks) {
            sum += cashMashine.getNumberCashOut();
        }
        return sum;
    }
    public double getCashInAmount() {
        double sum = 0;
        for (CashMashine cashMashine : banks) {
            sum += cashMashine.getNumberCashIn();
        }
        return sum;
    }

    public double getCashOutAverage() {
        double sum = 0;
        double count = 0;
        for (CashMashine cashMashine : banks) {
            sum += cashMashine.getCashOutAverage() * cashMashine.getNumberCashOut();
            count += cashMashine.getNumberCashOut();
        }
        if(count == 0) {
            return 0;
        }
        return sum/count;
    }
    public double getCashInAverage() {
        double sum = 0;
        double count = 0;
        for ( CashMashine cashMashine : banks) {
            sum += cashMashine.getCashInAverage() * cashMashine.getNumberCashIn();
            count += cashMashine.getNumberCashIn();
        }
      if(count == 0) {
          return  0;
      }
      return sum/count;
    }
}
