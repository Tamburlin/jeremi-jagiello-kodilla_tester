package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    Display display = new Display();

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        display.display(a + b);
        return a + b;
    }

    public double subtract(double a, double b) {
        display.display(a - b);
        return a - b;
    }

    public double multiply(double a, double b) {
        display.display(a * b);
        return a * b;
    }

    public double divide(double a, double b) {
        display.display(a / b);
        return a / b;
    }

    public static void main(String[] args) {
        Display display1 = new Display();
        Calculator calculator = new Calculator(display1);
        calculator.add(1,1);
    }
}