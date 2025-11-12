package ie.atu;

public class Calculator {
    public int add(int i, int i1) {
        if(i >= Integer.MAX_VALUE || i1 >= Integer.MAX_VALUE)
            throw new ArithmeticException("Number cannot be greater than or equal to Integer.MAX_VALUE");
        int result = i+i1;
        return result;
    }

    public int sub(int i, int i1) {
        if(i <= Integer.MIN_VALUE || i1 <= Integer.MIN_VALUE)
            throw new ArithmeticException("Number cannot be less than or equal to Integer.MIN_VALUE");
        int result = i-i1;
        return result;
    }

    public int mul(int i, int i1) {
        return i * i1;
    }

    public int div(int i, int i1) {
        return i / i1;
    }
}
