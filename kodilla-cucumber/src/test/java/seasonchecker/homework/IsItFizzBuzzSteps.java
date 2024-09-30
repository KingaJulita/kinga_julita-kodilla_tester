package seasonchecker.homework;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsItFizzBuzzSteps {
    private int number;
    private String result;


    @Given("the number is 3")
    public void the_number_is_3() {
        this.number = 3;
    }

    @Given("the number is 5")
    public void the_number_is_5() {
        this.number = 5;
    }

    @Given("the number is 15")
    public void the_number_is_15() {
        this.number = 15;
    }

    @Given("the number is 2")
    public void the_number_is_2() {
        this.number = 2;
    }

    @Given("the number is 9")
    public void the_number_is_9() {
        this.number = 9;
    }

    @Given("the number is 10")
    public void the_number_is_10() {
        this.number = 10;
    }

    @Given("the number is 30")
    public void the_number_is_30() {
        this.number = 30;
    }

    @Given("the number is 7")
    public void the_number_is_7() {
        this.number = 7;
    }

    @When("I check the divisibility")
    public void i_check_the_divisibility() {
        this.result = FizzBuzz.fizzBuzz(this.number);
    }

    @Then("I should get {string}")
    public void i_should_be_told(String expectedResult) {
        assertEquals(expectedResult, this.result);
    }
}
