package fizzbuzzchecker;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

import static com.kodilla.fizzbuzzchecker.FizzBuzzChecker.checkIfDivisible;

public class FizzBuzzSteps {

    private int number;
    private String answer;

    @Given("There is number {int}")
    public void there_is_number(Integer int1) {
        this.number = int1;
    }

    @When("I ask if it is divisible by {int} and\\/or {int}")
    public void i_ask_if_it_is_divisible_by_and_or(Integer int1, Integer int2) {
        this.answer = checkIfDivisible(number);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String string) {
        System.out.println(number + " " + answer);
        Assertions.assertEquals(answer,string);
    }

    @Then("I should be told \"Fizz")
    public void i_should_be_told_fizz() {
        System.out.println(number + " " + answer);
        Assertions.assertEquals(answer,"Fizz");
    }

    @Then("I should be told \"None")
    public void i_should_be_told_none() {
        System.out.println(number + " " + answer);
        Assertions.assertEquals(answer,"None");
    }
}
