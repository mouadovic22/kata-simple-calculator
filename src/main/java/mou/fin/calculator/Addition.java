package mou.fin.calculator;

public class Addition implements Operation {
    @Override
    public boolean applies(String input) {
        return input.contains("+");
    }

    @Override
    public int apply(int operand1, int operand2) {
        return operand1 + operand2;
    }



}
