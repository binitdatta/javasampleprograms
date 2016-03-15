package com.rollingstone.scope;

public class VariablePromition {

  public static void main(String args[]) {
    byte byteVariable = 42;
    char charVariable = 'b';
    short shortVriable = 1024;
    int intVariable = 50000;
    float floatVariable = 5.67f;
    double doubeVariable = .1234;
    double result = (floatVariable * byteVariable) + (intVariable / charVariable)
        - (doubeVariable * shortVriable);
    System.out.println((floatVariable * byteVariable) + " + " + (intVariable / charVariable) + " - "
        + (doubeVariable * shortVriable));
    System.out.println("result = " + result);
  }
}
