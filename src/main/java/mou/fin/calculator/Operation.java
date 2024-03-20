package mou.fin.calculator;

public interface Operation {
    boolean applies(String input);
    int apply(int operand1, int operand2);
}
