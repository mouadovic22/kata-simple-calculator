package mou.fin.calculator.cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mou.fin.calculator.*;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SimpleCalculatorSteps {
    private SimpleCalculator simpleCalculator;
    private int result;
    private Exception exception;

    @Given("I have a simple calculator")
    public void i_have_a_simple_calculator() {
        List<Operation> operations = Arrays.asList(new Addition(), new Subtraction(), new Multiplication());
        simpleCalculator = new SimpleCalculator(operations);
    }

    @When("I input {string}")
    public void i_input(String input) {
        try {
            result = simpleCalculator.calculate(input);
        } catch (Exception e) {
            exception = e;
        }
    }

    @Then("I should get {int}")
    public void i_should_get(int expected) {
        assertEquals(expected, result);
    }

    @Then("I should get an error {string}")
    public void i_should_get_an_error(String expected) {
        assertEquals(expected, exception.getMessage());
    }
}