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
}
