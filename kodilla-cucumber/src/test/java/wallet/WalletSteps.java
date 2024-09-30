package wallet;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WalletSteps {
    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    @Given("I have deposited $200 in my wallet")
    public void i_have_deposited_$200_in_my_wallet() {
        wallet.deposit(200);
        assertEquals(200, wallet.getBalance(), "Incorrect wallet balance");
    }

    @When("I request $30")
    public void i_request_$30() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 30);
    }

    @Then("$30 should be dispensed")
    public void $30_should_be_dispensed() {
        assertEquals(30, cashSlot.getContents());
    }

    @When("I request $200")
    public void i_request_$200() {
        Cashier cashier = new Cashier(cashSlot);
        cashier.withdraw(wallet, 200);
    }

    @Then("$200 should be dispensed")
    public void $200_should_be_dispensed() {
        assertEquals(200, cashSlot.getContents());
    }
    @When("I request $300")
    public void i_request_$300() {
        Cashier cashier = new Cashier(cashSlot);
        assertThrows(IllegalArgumentException.class, () -> cashier.withdraw(wallet, 300), "Insufficient funds");
    }

    @Then("no money should be dispensed")
    public void no_money_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Money was dispensed despite insufficient funds");
    }

    @Then("I should be told that I have insufficient funds")
    public void i_should_be_told_that_I_have_insufficient_funds() {
        // This is validated by the exception thrown in the "When" step
    }

}
