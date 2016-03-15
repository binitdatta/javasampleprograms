package com.rollingstone.scope;

public class DataTypeConversion {

  public static void main(String args[]) {
    byte byteVariavle;
    int intVariavle = 257;
    double doubleVariable = 323.142;

    System.out
        .println("\nConversion of an integer variavle to a  shorter byte datatype variable .");
    byteVariavle = (byte) intVariavle;
    System.out.println("integer and byte variable values " + intVariavle + " " + byteVariavle);

    System.out.println("\nConversion of double variable to an integer variable.");
    intVariavle = (int) doubleVariable;
    System.out.println("double and integer " + doubleVariable + " " + intVariavle);

    System.out.println("\nConversion of double variable to a byte variable.");
    byteVariavle = (byte) doubleVariable;
    System.out.println("double and byte " + doubleVariable + " " + byteVariavle);
  }
}
