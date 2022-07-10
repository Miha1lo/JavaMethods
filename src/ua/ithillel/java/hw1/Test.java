package ua.ithillel.java.hw1;

public class Test {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 5;
        double num3 = 10.5;
        double num4 = 5.1;

        int addInt = Calculator.add(num1, num2);
        System.out.println("Method int add: " + addInt);

        double addDouble = Calculator.add(num3, num4);
        System.out.println("Method double add: " + addDouble);

        int subInt = Calculator.sub(num1, num2);
        System.out.println("Method int sub: " + subInt);

        double subDouble = Calculator.sub(num3, num4);
        System.out.println("Method double sub: " + subDouble);

        int mulInt = Calculator.mul(num1, num2);
        System.out.println("Method int mul: " + mulInt);

        double mulDouble = Calculator.mul(num3, num4);
        System.out.println("Method double mul: " + mulDouble);

        int divInt = Calculator.div(num1, num2);
        System.out.println("Method int div: " + divInt);

        double divDouble = Calculator.div(num3, num4);
        System.out.println("Method double div: " + divDouble);
    }
}
