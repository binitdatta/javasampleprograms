package com.rollingstone.scope;

public class ScopeInJava {

  public static void main(String args[]) {
    int globalScope; // All of the code can see and manipulate this variable

    globalScope = 100;
    if (globalScope == 100) { // This curly bracket starts a new scope
      int localScopeTillThenextCurlyBracket = 200; // known only to this block

      // x and y both known here.
      System.out.println("globalScope and localScopeTillThenextCurlyBracket: " + globalScope + " "
          + localScopeTillThenextCurlyBracket);
      globalScope = localScopeTillThenextCurlyBracket * 2;
    }
    // localScopeTillThenextCurlyBracket = 100; // Error! localScopeTillThenextCurlyBracket not
    // known here

    // x is still known here.
    System.out.println("globalScope is " + globalScope);
  }
}
