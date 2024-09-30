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

    @Then("the balance of my wallet should be ${int}")
    public void the_balance_of_my_wallet_should_be_$(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Incorrect wallet balance");
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
    }

    @Given("there is ${int} in my wallet")
    public void there_is_$100_in_my_wallet(Integer amount) {
        wallet.deposit(amount);
        assertEquals(amount, wallet.getBalance(), "Incorrect wallet balance after deposit");
    }

    @When("I withdraw ${int}")
    public void i_withdraw_$200(Integer amount) {
        Cashier cashier = new Cashier(cashSlot);
        assertThrows(IllegalArgumentException.class, () -> cashier.withdraw(wallet, amount), "Insufficient funds");
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
    }

    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        assertEquals(0, cashSlot.getContents(), "Money was dispensed despite insufficient funds");
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_I_dont_have_enough_money_in_my_wallet() {
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$100(Integer expectedBalance) {
        assertEquals(expectedBalance, wallet.getBalance(), "Incorrect wallet balance displayed");
    }
}
