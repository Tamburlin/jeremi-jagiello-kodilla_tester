package wallet;

import com.kodilla.wallet.CashSlot;
import com.kodilla.wallet.Cashier;
import com.kodilla.wallet.Wallet;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class WalletSteps {
    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot( wallet);

    @Given("I have deposited {int} in my wallet")
    public void i_have_deposited_in_my_wallet(Integer int1) {
        wallet.deposit(int1);
    }

    @When("I request {int}")
    public void i_request(Integer int1) {
        Cashier cashier = new Cashier(cashSlot, wallet);
        cashier.withdrawal(wallet, int1);
    }

    @Then("{int} should be dispensed")
    public void should_be_dispensed(Integer int1) {
        Assertions.assertEquals(int1, cashSlot.getContents());
    }

    @Then("{int} cash should remain in my wallet")
    public void cash_should_remain_in_my_wallet(Integer int1) {
        Assertions.assertEquals(int1, wallet.getBalance());
    }

    @Given("there is ${int} in my wallet")
    public void there_is_$_in_my_wallet(Integer int1) {
        wallet.deposit(100);
    }

    @When("I withdraw ${int}")
    public void i_withdraw_$(Integer int1) {
        Cashier cashier = new Cashier(cashSlot, wallet);
        cashier.withdrawal(wallet, 200);
    }

    @Then("I should be told that I don't have enough money in my wallet")
    public void i_should_be_told_that_i_don_t_have_enough_money_in_my_wallet() {
        Assertions.assertEquals(cashSlot.getMessage(),wallet.getNotEnoughMoneyMessage());
    }
    @Then("nothing should be dispensed")
    public void nothing_should_be_dispensed() {
        Assertions.assertEquals(0, cashSlot.getContents());
    }

    @When("I check the balance of my wallet")
    public void i_check_the_balance_of_my_wallet() {
        wallet.getBalance();
    }

    @Then("I should see that the balance is ${int}")
    public void i_should_see_that_the_balance_is_$(Integer int1) {
        Assertions.assertEquals(wallet.getBalance(), 100);
    }
}
